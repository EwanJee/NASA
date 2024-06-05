package com.project.nasa.application.port.out.usecase.apod

import com.project.nasa.setting.application.port.out.response.apod.ApodData
import java.time.LocalDate

interface ApodPort {
    fun convertApod(
        url: String,
        date: LocalDate,
    ): ApodData
}
