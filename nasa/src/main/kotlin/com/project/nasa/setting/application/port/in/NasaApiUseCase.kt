package com.project.nasa.setting.application.port.`in`

import com.project.nasa.setting.application.port.`in`.dto.response.ResponseApod
import java.time.LocalDate

interface NasaApiUseCase {
    fun getApod(url: String, date: LocalDate): ResponseApod
}