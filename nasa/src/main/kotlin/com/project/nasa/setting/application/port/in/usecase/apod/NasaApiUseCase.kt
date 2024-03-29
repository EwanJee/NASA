package com.project.nasa.setting.application.port.`in`.usecase.apod

import com.project.nasa.setting.application.port.`in`.dto.response.apod.ResponseApod
import java.time.LocalDate

interface NasaApiUseCase {
    fun getApod(url: String, date: LocalDate): ResponseApod
}