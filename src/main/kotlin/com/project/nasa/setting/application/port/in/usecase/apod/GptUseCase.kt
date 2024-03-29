package com.project.nasa.setting.application.port.`in`.usecase.apod

interface GptUseCase {
    fun translateByLanguage(lang: String, content: String): String
}