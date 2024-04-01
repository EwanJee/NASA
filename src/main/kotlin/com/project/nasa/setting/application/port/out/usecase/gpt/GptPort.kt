package com.project.nasa.setting.application.port.out.usecase.gpt

interface GptPort {
    fun getTranslation(lang: String, content: String): String
}