package com.project.nasa.setting.application.service

import com.project.nasa.setting.application.port.`in`.GptUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.Message
import com.project.nasa.setting.application.port.`in`.dto.request.RequestGPT
import com.project.nasa.setting.application.port.`in`.dto.response.ResponseGPT
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class GptService(
    private val gptClient: WebClient
) : GptUseCase {
    override fun translateByLanguage(lang: String, content: String): String {
        val messageSystem = Message(role = "system", content = lang)
        messageSystem.updateContent(null)
        val messageUser = Message(role = "user", content = content)
        messageUser.updateContent(content)
        val requestGPT = RequestGPT(model = "gpt-3.5-turbo", messages = mutableListOf())
        requestGPT.addMessage(messageSystem)
        requestGPT.addMessage(messageUser)

        val responseGPT = gptClient.post()
            .bodyValue(requestGPT)
            .retrieve()
            .bodyToMono(ResponseGPT::class.java)
            .block()
        if (responseGPT == null) throw IllegalArgumentException("요청 정보가 잘못되었습니다")
        return responseGPT.choices[0].message.content
    }
}