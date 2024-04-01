package com.project.nasa.setting.adapter.out.persistence.service.news.impl

import com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity
import com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity
import com.project.nasa.setting.adapter.out.persistence.repository.news.NewsEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestArticle
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.adapter.out.persistence.service.news.dto.ResponseNews
import com.project.nasa.setting.application.port.out.data.ArticleData
import com.project.nasa.setting.application.port.out.data.NewsData
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Transactional(readOnly = true)
@Service
class NewsAndArticleAdapterImpl(
    private val newsEntityRepository: NewsEntityRepository
) : NewsAndArticleAdapter {
    override fun getByQAndDate(topic: String, date: LocalDate): ResponseNews? {
        val newsEntity = newsEntityRepository.findByTopicAndDate(topic, date) ?: return null
        val articleList: List<ArticleData> =
            newsEntity.articles
                .map { article ->
                    ArticleData(
                        title = article.title,
                        description = article.description,
                        url = article.url,
                        image = article.image,
                    )
                }
        return ResponseNews(
            totalResults = newsEntity.totalResults,
            articles = articleList,
            topic = topic,
            date = date,
            id = newsEntity.id
        )
    }

    // join
    @Transactional
    override fun join(topic: String, date: LocalDate, newsData: NewsData): ResponseNews {
        val articles: List<ArticleEntity> = newsData.articles
            .map { article ->
                ArticleEntity(
                    null,
                    article.title,
                    article.description,
                    article.url,
                    article.image,
                    null
                )
            }
        val newsEntity: NewsEntity = NewsEntity(
            id = null,
            topic = topic,
            date = date,
            totalResults = newsData.totalResults,
            articles = articles
        )
        val saved = newsEntityRepository.save(newsEntity)
        return ResponseNews(
            totalResults = saved.totalResults,
            articles = newsData.articles,
            topic = topic,
            date = date,
            id = saved.id
        )
    }
}