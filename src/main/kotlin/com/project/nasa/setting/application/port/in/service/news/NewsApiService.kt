package com.project.nasa.setting.application.port.`in`.service.news

import com.project.nasa.common.exception.ErrorCode
import com.project.nasa.common.exception.news.NewsException
import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.domain.news.Article
import com.project.nasa.setting.domain.news.News
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.WebClientResponseException
import org.springframework.web.reactive.function.client.awaitBody
import java.time.LocalDate

@Component
class NewsApiService(
    private val newsClient: WebClient
) : NewsUseCase {
    override suspend fun getAndPutApi(q: String, date: LocalDate, lang: String): News {
        val requestNews : RequestNews = try {
            newsClient.get()
                .uri { uriBuilder ->
                    uriBuilder
                        .queryParam("q", q)
                        .queryParam("from", date)
                        .queryParam("to", date)
                        .queryParam("language", lang)
                        .build()
                }
                .retrieve()
                .awaitBody<RequestNews>()
        } catch (e : WebClientResponseException) {
            throw NewsException(ErrorCode.TOO_MANY_REQUESTS)
        }
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