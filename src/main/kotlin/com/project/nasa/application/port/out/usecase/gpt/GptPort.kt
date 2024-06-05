package com.project.nasa.application.port.out.usecase.gpt

interface GptPort {
    fun getTranslation(
        lang: String,
        content: String,
    ): String
}
