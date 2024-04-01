package com.project.nasa.setting.application.port.out.service


import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.application.port.`in`.service.news.NewsApiService
import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.out.data.ArticleData
import com.project.nasa.setting.application.port.out.data.NewsData
import com.project.nasa.setting.application.port.out.usecase.NewsPort
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class NewsPortRouter(
    private val newsUseCase: NewsUseCase
) : NewsPort {

    override fun sendNewsApi(q : String, date : LocalDate, lang : String) : NewsData{
        val requestNews = newsUseCase.getAndPutApi(q,date,lang)
        val articleDataList : List<ArticleData> = requestNews.articles
            .map {article ->
                ArticleData(
                    title = article.title,
                    description = article.description,
                    url = article.url,
                    image = article.image
                )
            }
        return NewsData(
            totalResults = requestNews.totalResults,
            articles = articleDataList
        )
    }
}