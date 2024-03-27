package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Table(name = "news")
@Entity
class NewsEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    val id: Long? = null,
    @Column(name = "total_results")
    val totalResults: Int,
    @OneToMany(mappedBy = "NEWS", cascade = [CascadeType.ALL])
    val articles: List<ArticleEntity>
)