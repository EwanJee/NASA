package com.nasa.todaynasa.application.service.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.ApodEntity
import com.nasa.todaynasa.application.port.`in`.apod.ApodCommand
import com.nasa.todaynasa.application.port.out.apod.ApodQuery
import com.nasa.todaynasa.application.service.apod.request.apod.RequestApod
import com.nasa.todaynasa.application.service.apod.request.gpt.Message
import com.nasa.todaynasa.application.service.apod.request.gpt.RequestAnswerGpt
import com.nasa.todaynasa.application.service.apod.request.gpt.RequestGpt
import com.nasa.todaynasa.domain.Apod
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import java.time.LocalDate

@Service
class ApodService(
    private val apodQuery: ApodQuery,
    private val nasaClient: WebClient,
    private val gptClient: WebClient,
) : ApodCommand {
    // apod 와 한국 번역문 제시
    override suspend fun getApodByDate(date: LocalDate): Apod {
        val apodEntity = apodQuery.getApodByDate(date)
        if (apodEntity != null) {
            return ApodEntity.from(apodEntity)
        }
        try {
            val requestApod: RequestApod =
                nasaClient
                    .get()
                    .uri { uriBuilder -> uriBuilder.queryParam("date", date).build() }
                    .retrieve()
                    .awaitBody<RequestApod>()
            val explanationKR: String = translateByGPT(requestApod.explanationEN)
            val apod: Apod = RequestApod.of(requestApod, explanationKR)
            apodQuery.saveApod(apod)
            return apod
        } catch (e: Exception) {
            throw e
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
            throw e
        }
    }
}
