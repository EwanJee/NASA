package com.project.nasa.setting.application.service

import com.kwabenaberko.newsapilib.NewsApiClient
import com.kwabenaberko.newsapilib.models.request.TopHeadlinesRequest
import com.kwabenaberko.newsapilib.models.response.ArticleResponse
import com.project.nasa.setting.application.port.`in`.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Service
class NewsApiService(
    //NewsApi 라이브러리 이용
    private val newsApiClient: NewsApiClient,
    private val newsClient: WebClient
) : NewsUseCase {
    override fun getAndPutApi(q: String, date: LocalDate, lang: String): ResponseNews {
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
            .bodyToMono(ResponseNews::class.java)
            .block()
        if (news == null) throw IllegalArgumentException("날짜를 너무 앞당겼습니다. 무료버전이니 양해부탁드립니다")
        news.trimArticles()
        return news
    }

    override fun getHeadlines(): String? {
        var description: String? = null
        newsApiClient.getTopHeadlines(
            TopHeadlinesRequest.Builder()
                .q("bitcoin")
                .language("en")
                .build(),
            object : NewsApiClient.ArticlesResponseCallback {
                override fun onSuccess(response: ArticleResponse) {
                    description = response.articles[0].title
                }

                override fun onFailure(throwable: Throwable) {
                    println(throwable.message)
                }
            }
        )
        return description
    }
}