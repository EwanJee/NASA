package com.project.nasa.setting.application.port.out.service.apod

import com.project.nasa.setting.application.port.`in`.usecase.apod.NasaApiUseCase
import com.project.nasa.setting.application.port.out.response.apod.ApodData
import com.project.nasa.setting.application.port.out.usecase.apod.ApodPort
import com.project.nasa.setting.domain.apod.Apod
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ApodPortRouter(
    private val nasaApiUseCase: NasaApiUseCase
) : ApodPort {
    override fun convertApod(url: String, date: LocalDate): ApodData {
        val apod: Apod = nasaApiUseCase.getApod(url, date)
        return ApodData(
            date = apod.date,
            explanation = apod.explanation,
            mediaType = apod.mediaType,
            title = apod.title,
            url = apod.url,
            hdurl = apod.hdurl
        )
    }
}