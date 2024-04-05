package com.project.nasa.setting.adapter.out.persistence.entity.news

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.time.LocalDate

@Table(name = "news")
@Entity
class NewsEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    val id: Long? = null,
    @Column(name = "topic")
    val topic: String,
    @Column(name = "date")
    val date: LocalDate,
    @Column(name = "total_results")
    val totalResults: Int,
    @OneToMany(mappedBy = "news", cascade = [CascadeType.ALL])
    val articles: List<ArticleEntity>,
    @OneToMany(mappedBy = "news", cascade = [CascadeType.ALL])
    var articles_en: List<ArticleEntity>?
){
    fun updateArticlesEn(articlesEn: List<ArticleEntity>){
        this.articles_en = articlesEn
    }
}