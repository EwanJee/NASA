package com.project.nasa.setting.application.port.`in`.service.apod

import com.project.nasa.setting.application.port.`in`.usecase.apod.GptUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.gpt.Message
import com.project.nasa.setting.application.port.`in`.dto.request.gpt.RequestBodyGPT
import com.project.nasa.setting.application.port.`in`.dto.request.gpt.RequestGPT
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class GptApiService(
    private val gptClient: WebClient
) : GptUseCase {
    override fun translateByLanguage(lang: String, content: String): String {
        val messageSystem = Message(role = "system", content = lang)
        messageSystem.updateContent(null)
        val messageUser = Message(role = "user", content = content)
        messageUser.updateContent(content)
        val requestGPT = RequestBodyGPT(model = "gpt-3.5-turbo", messages = mutableListOf())
        requestGPT.addMessage(messageSystem)
        requestGPT.addMessage(messageUser)

        val responseGPT = gptClient.post()
            .bodyValue(requestGPT)
            .retrieve()
            .bodyToMono(RequestGPT::class.java)
            .block()
        if (responseGPT == null) throw IllegalArgumentException("요청 정보가 잘못되었습니다")
        return responseGPT.choices[0].message.content
    }
}