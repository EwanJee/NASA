package com.project.nasa.application.port.out.service.gpt

import com.project.nasa.application.port.`in`.usecase.apod.GptUseCase
import com.project.nasa.setting.application.port.out.usecase.gpt.GptPort
import org.springframework.stereotype.Component

@Component
class GpotPortRouter(
    private val gptUseCase: com.project.nasa.application.port.`in`.usecase.apod.GptUseCase,
) : GptPort {
    override fun getTranslation(
        lang: String,
        content: String,
    ): String {
        return gptUseCase.translateByLanguage(lang, content)
    }
}