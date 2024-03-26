package com.project.nasa.setting.application.port.`in`

interface GptUseCase {
    fun translateByLanguage(lang: String, content: String): String
}