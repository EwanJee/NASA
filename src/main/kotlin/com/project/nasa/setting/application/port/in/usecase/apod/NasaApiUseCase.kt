package com.project.nasa.setting.application.port.`in`.usecase.apod

import com.project.nasa.setting.domain.apod.Apod
import java.time.LocalDate

interface NasaApiUseCase {
    fun getApod(url: String, date: LocalDate): Apod
}