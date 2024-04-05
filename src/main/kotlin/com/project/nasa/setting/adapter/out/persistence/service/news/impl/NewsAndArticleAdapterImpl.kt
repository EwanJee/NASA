package com.project.nasa.setting.adapter.out.persistence.service.news.impl

import com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity
import com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity
import com.project.nasa.setting.adapter.out.persistence.repository.news.NewsEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter
import com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews
import com.project.nasa.setting.application.port.out.response.news.ArticleData
import com.project.nasa.setting.application.port.out.response.news.NewsData
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Transactional(readOnly = true)
@Service
class NewsAndArticleAdapterImpl(
    private val newsEntityRepository: NewsEntityRepository
) : NewsAndArticleAdapter {
    override fun getByQAndDate(topic: String, date: LocalDate, lang: String): ResponseNews? {
        val newsEntity = newsEntityRepository.findByTopicAndDate(topic, date) ?: return null
        if (lang != "ko" && newsEntity.articles_en?.isEmpty() == true) return null
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
        val articlesEn: List<ArticleData> = newsEntity.articles_en?.map { article ->
            ArticleData(
                title = article.title,
                description = article.description,
                url = article.url,
                image = article.image,
            )
        } ?: emptyList()
        return ResponseNews(
            totalResults = newsEntity.totalResults,
            articles = articleList,
            topic = topic,
            date = date,
            id = newsEntity.id,
            articles_en = articlesEn
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
        val newsEntity = NewsEntity(
            id = null,
            topic = topic,
            date = date,
            totalResults = newsData.totalResults,
            totalResultsEn = 0,
            articles = articles,
            articles_en = null
        )
        val saved = newsEntityRepository.save(newsEntity)
        return ResponseNews(
            totalResults = saved.totalResults,
            articles = newsData.articles,
            topic = topic,
            date = date,
            id = saved.id,
            articles_en = null
        )
    }

    @Transactional
    override fun updateNewsEn(q: String, date: LocalDate, newsData: NewsData): ResponseNews {
        val newsEntity = newsEntityRepository.findByTopicAndDate(q, date) ?: throw IllegalArgumentException()
        val articlesEn: List<ArticleEntity> = newsData.articles
            .map { article ->
                ArticleEntity(
                    null,
                    article.title,
                    article.description,
                    article.url,
                    article.image,
                    newsEntity
                )
            }
        newsEntity.updateArticlesEn(articlesEn)
        return ResponseNews(
            totalResults = newsEntity.totalResultsEn,
            articles = newsEntity.articles.map { article ->
                ArticleData(
                    title = article.title,
                    description = article.description,
                    url = article.url,
                    image = article.image,
                )
            },
            topic = newsEntity.topic,
            date = newsEntity.date,
            id = newsEntity.id,
            articles_en = newsEntity.articles_en?.map { article ->
                ArticleData(
                    title = article.title,
                    description = article.description,
                    url = article.url,
                    image = article.image,
                )
            }
        )
    }
}