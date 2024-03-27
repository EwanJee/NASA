package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.*

@Table(name = "article")
@Entity
class ArticleEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    val id: Long?,
    @Column(name = "author")
    val author: String,
    @Column(name = "title")
    val title: String,
    @Column(name = "description")
    val description: String,
    @Column(name = "author")
    val url: String,
    @Column(name = "image")
    val image: String,
    @Column(name = "content")
    val content: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_id")
    val news: NewsEntity
) {
}