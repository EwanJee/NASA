package com.project.nasa.setting.application.port.`in`.service.news

import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.domain.news.Article
import com.project.nasa.setting.domain.news.News
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import java.time.LocalDate

@Component
class NewsApiService(
    private val newsClient: WebClient
) : NewsUseCase {
    override fun getAndPutApi(q: String, date: LocalDate, lang: String): News {
        val requestNews = newsClient.get()
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
        if (requestNews == null) throw IllegalArgumentException("요청 정보가 불일치 합니다")
        val articles = requestNews.articles.map { requestArticle ->
            Article(
                author = requestArticle.author,
                title = requestArticle.title,
                description = requestArticle.description,
                url = requestArticle.url,
                image = requestArticle.image,
                content = requestArticle.content
            )
        }
        val news = News(
            totalResults = requestNews.totalResults,
            articles = articles
        )
        news.trimArticles()
        return news
    }
}