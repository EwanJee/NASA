package com.project.nasa.setting.adapter.out.persistence.entity.news

import jakarta.persistence.*

@Table(name = "article")
@Entity
class ArticleEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    val id: Long?,
    @Column(name = "title")
    val title: String?,
    @Column(name = "description", length = 2000)
    val description: String?,
    @Column(name = "url", length = 500)
    val url: String?,
    @Column(name = "image", length = 500)
    val image: String?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "news_id")
    val news: NewsEntity?
)