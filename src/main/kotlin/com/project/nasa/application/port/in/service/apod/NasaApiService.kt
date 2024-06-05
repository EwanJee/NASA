package com.project.nasa.application.port.`in`.service.apod

import com.project.nasa.domain.apod.Apod
import com.project.nasa.setting.application.port.`in`.usecase.apod.NasaApiUseCase
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Component
class NasaApiService(
    private val nasaClient: WebClient,
) : NasaApiUseCase {
    @Value("\${openApi.key}")
    private lateinit var value: String
    private final val key: String by lazy {
        value
    }

    override fun getApod(
        url: String,
        date: LocalDate,
    ): Apod {
        val baseUrl: String = getApiURL(url, date)
        val response =
            nasaClient
                .get()
                .uri(baseUrl)
                .retrieve()
                .bodyToMono(com.project.nasa.application.port.`in`.dto.request.apod.RequestApod::class.java)
                .block()
        if (response == null) throw IllegalArgumentException("요청 정보가 잘못 되었습니다")
        return Apod(
            date = response.date,
            explanation = response.explanation,
            mediaType = response.media_type,
            title = response.title,
            url = response.url,
            hdurl = response.hdurl,
        )
    }

    private fun getApiURL(
        url: String,
        date: LocalDate,
    ): String {
        return "$url?date=$date&api_key=$key"
    }
}

// todo:외부 영역 즉 외부 네트워크를 호출하기 때문에 Adapter 가 맞지 않을까?  적절한 메타포 사용필요
