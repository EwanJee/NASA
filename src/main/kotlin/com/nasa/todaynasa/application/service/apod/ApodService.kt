package com.nasa.todaynasa.application.service.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.ApodEntity
import com.nasa.todaynasa.application.port.`in`.apod.ApodCommand
import com.nasa.todaynasa.application.port.`in`.apod.dto.request.RequestApod
import com.nasa.todaynasa.application.port.out.apod.ApodCommandPort
import com.nasa.todaynasa.domain.Apod
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import java.time.LocalDate

@Service
class ApodService(
    private val apodCommandPort: ApodCommandPort,
    private val nasaClient: WebClient,
) : ApodCommand {
    override suspend fun getApodByDate(date: LocalDate): Apod {
        val apodEntity = apodCommandPort.getApodByDate(date)
        if (apodEntity != null) {
            return ApodEntity.from(apodEntity)
        }
        try {
            val requestApod =
                nasaClient
                    .get()
                    .uri { uriBuilder ->
                        uriBuilder
                            .queryParam("date", date)
                            .build()
                    }.retrieve()
                    .awaitBody<RequestApod>()
            return RequestApod.from(requestApod)
        } catch (e: Exception) {
            throw e
        }
    }
}
