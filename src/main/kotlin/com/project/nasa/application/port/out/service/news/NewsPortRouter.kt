package com.project.nasa.application.port.out.service.news

import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.out.response.news.ArticleData
import com.project.nasa.setting.application.port.out.response.news.NewsData
import com.project.nasa.setting.application.port.out.usecase.news.NewsPort
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class NewsPortRouter(
    private val newsUseCase: NewsUseCase,
) : NewsPort {
    override suspend fun convertNewsApi(
        q: String,
        date: LocalDate,
        lang: String,
    ): NewsData {
        val news = newsUseCase.getAndPutApi(q, date, lang)
        val articleDataList: List<ArticleData> =
            news.articles
                .map { article ->
                    ArticleData(
                        title = article.title,
                        description = article.description,
                        url = article.url,
                        image = article.image,
                    )
                }
        return NewsData(
            totalResults = news.totalResults,
            articles = articleDataList,
        )
    }
}
