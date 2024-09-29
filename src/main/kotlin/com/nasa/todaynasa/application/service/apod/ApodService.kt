package com.nasa.todaynasa.application.service.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.ApodEntity
import com.nasa.todaynasa.application.port.`in`.apod.ApodCommand
import com.nasa.todaynasa.application.port.out.apod.ApodQuery
import com.nasa.todaynasa.application.port.out.email.EmailQuery
import com.nasa.todaynasa.application.service.apod.request.apod.RequestApod
import com.nasa.todaynasa.application.service.apod.request.gpt.Message
import com.nasa.todaynasa.application.service.apod.request.gpt.RequestAnswerGpt
import com.nasa.todaynasa.application.service.apod.request.gpt.RequestGpt
import com.nasa.todaynasa.domain.Apod
import com.nasa.todaynasa.domain.exception.BusinessException
import com.nasa.todaynasa.domain.exception.ErrorCode
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import java.time.LocalDate

@Service
class ApodService(
    private val apodQuery: ApodQuery,
    private val nasaClient: WebClient,
    private val gptClient: WebClient,
    private val emailQuery: EmailQuery,
) : ApodCommand {
    // apod 와 한국 번역문 제시
    override suspend fun getApodByDate(date: LocalDate): Apod {
        apodQuery.getApodByDate(date)?.let { return ApodEntity.from(it) }
        try {
            val requestApod =
                nasaClient
                    .get()
                    .uri { uriBuilder -> uriBuilder.queryParam("date", date).build() }
                    .retrieve()
                    .awaitBody<RequestApod>()
            val explanationKR = translateByGPT(requestApod.explanationEN)
            val apod = RequestApod.of(requestApod, explanationKR)
            apodQuery.saveApod(apod)
            return apod
        } catch (e: Exception) {
            throw e
        }
    }

    override suspend fun sendImageToEmail(
        date: LocalDate,
        email: String,
    ): JsonObject {
        val apodEntity = apodQuery.getApodByDate(date) ?: throw BusinessException(ErrorCode.APOD_NOT_FOUND)
        val imageUrl = apodEntity.url
        val explanation = apodEntity.explanationKR
        // send email
        emailQuery.sendImage(email, imageUrl, explanation)
        return buildJsonObject {
            put("email", email)
            put("imageUrl", imageUrl)
            put("explanation", explanation)
        }
    }

    private suspend fun translateByGPT(explanation: String): String {
        val messageSystem = Message(role = "system", content = "Korean")
        messageSystem.updateContent(null)
        val messageUser = Message(role = "user", content = explanation)
        messageUser.updateContent(explanation)
        val requestGpt = RequestGpt(model = "gpt-3.5-turbo", messages = mutableListOf(messageSystem, messageUser))
        try {
            val answer =
                gptClient
                    .post()
                    .bodyValue(requestGpt)
                    .retrieve()
                    .awaitBody<RequestAnswerGpt>()
            return answer.choices[0].message.content
        } catch (e: Exception) {
            throw BusinessException(ErrorCode.GPT_TRANSLATE_FAILED, e)
        }
    }
}
