package com.project.nasa.setting.application.port.`in`

import com.project.nasa.setting.application.port.`in`.dto.response.ResponseApod
import reactor.core.publisher.Mono
import java.time.LocalDate

interface ApiUseCase {
    fun getApod(url: String, date: LocalDate ): ResponseApod
}