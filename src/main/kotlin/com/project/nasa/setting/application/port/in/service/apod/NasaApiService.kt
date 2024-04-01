package com.project.nasa.setting.application.port.`in`.service.apod

import com.project.nasa.setting.application.port.`in`.dto.request.apod.RequestApod
import com.project.nasa.setting.application.port.`in`.usecase.apod.NasaApiUseCase
import com.project.nasa.setting.domain.apod.Apod
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Component
class NasaApiService(
    private val nasaClient: WebClient
) : NasaApiUseCase {
    @Value("\${openApi.key}")
    private lateinit var value: String
    private final val key: String by lazy {
        value
    }

    override fun getApod(url: String, date: LocalDate): Apod {
        val baseUrl: String = getApiURL(url, date)
        val requestApod = nasaClient
            .get()
            .uri(baseUrl)
            .retrieve()
            .bodyToMono(RequestApod::class.java)
            .block()
        if (requestApod == null) throw IllegalArgumentException("요청 정보가 잘못 되었습니다")
        return Apod(
            date = requestApod.date,
            explanation = requestApod.explanation,
            mediaType = requestApod.media_type,
            title = requestApod.title,
            url = requestApod.url,
            hdurl = requestApod.hdurl
        )
    }

    private fun getApiURL(url: String, date: LocalDate): String {
        return "${url}?date=${date}&api_key=${key}"
    }
}