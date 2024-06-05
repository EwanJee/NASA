package com.project.nasa.application.port.`in`.usecase.apod

interface GptUseCase {
    fun translateByLanguage(
        lang: String,
        content: String,
    ): String
}
