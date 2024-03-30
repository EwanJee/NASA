package com.project.nasa.setting.application.service.news

import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Service
class NewsApiService(
    private val newsClient: WebClient
) : NewsUseCase {
    override fun getAndPutApi(q: String, date: LocalDate, lang: String): RequestNews {
        val news = newsClient.get()
            .uri { uriBuilder ->
                uriBuilder
                    .queryParam("q", q)
                    .queryParam("from", date)
                    .queryParam("sortBy", "published")
                    .queryParam("language", lang)
                    .build()
            }
            .retrieve()
            .bodyToMono(RequestNews::class.java)
            .block()
        if (news == null) throw IllegalArgumentException("날짜를 너무 앞당겼습니다. 무료버전이니 양해부탁드립니다")
        news.trimArticles()
        return news
    }
}