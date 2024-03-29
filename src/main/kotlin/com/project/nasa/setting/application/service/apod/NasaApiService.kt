package com.project.nasa.setting.application.service.apod

import com.project.nasa.setting.application.port.`in`.usecase.apod.NasaApiUseCase
import com.project.nasa.setting.application.port.`in`.dto.response.apod.ResponseApod
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Service
class NasaApiService(
    private val nasaClient: WebClient
) : NasaApiUseCase {
    @Value("\${openApi.key}")
    private lateinit var value: String
    private final val key: String by lazy {
        value
    }

    override fun getApod(url: String, date: LocalDate): ResponseApod {
        val baseUrl: String = getApiURL(url, date)
        val responseApod = nasaClient
            .get()
            .uri(baseUrl)
            .retrieve()
            .bodyToMono(ResponseApod::class.java)
            .block()
        if (responseApod == null) throw IllegalArgumentException("요청 정보가 잘못 되었습니다")
        return responseApod
    }

    private fun getApiURL(url: String, date: LocalDate): String {
        return "${url}?date=${date}&api_key=${key}"
    }
}