package com.project.nasa.setting.adapter.out.persistence.member.service.news.impl

import com.project.nasa.setting.adapter.out.persistence.member.entity.news.ArticleEntity
import com.project.nasa.setting.adapter.out.persistence.member.entity.news.NewsEntity
import com.project.nasa.setting.adapter.out.persistence.member.repository.news.ArticleEntityRepository
import com.project.nasa.setting.adapter.out.persistence.member.repository.news.NewsEntityRepository
import com.project.nasa.setting.adapter.out.persistence.member.service.news.NewsAndArticleAdapter
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseArticle
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
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
        val list: List<ResponseArticle> =
            newsEntity.articles
                .map { article ->
                    ResponseArticle(
                        null,
                        article.author,
                        article.title,
                        article.description,
                        article.url,
                        article.image,
                        article.content
                    )
                }
        return ResponseNews(
            totalResults = newsEntity.totalResults,
            articles = list,
            topic = topic,
            date = date,
            id = newsEntity.id
        )
    }
    // join
    @Transactional
    override fun join(topic: String, date: LocalDate, requestNews: RequestNews): ResponseNews {
        val articles: List<ArticleEntity> = requestNews.articles
            .map { article ->
                ArticleEntity(
                    null,
                    article.author,
                    article.title,
                    article.description,
                    article.url,
                    article.image,
                    article.content,
                    null
                )
            }
        val newsEntity: NewsEntity = NewsEntity(
            id = null,
            topic = topic,
            date = date,
            totalResults = requestNews.totalResults,
            articles = articles
        )
        val saved = newsEntityRepository.save(newsEntity)
        return ResponseNews(
            totalResults = saved.totalResults,
            articles = requestNews.articles,
            topic = topic,
            date = date,
            id = saved.id

        )
    }
}