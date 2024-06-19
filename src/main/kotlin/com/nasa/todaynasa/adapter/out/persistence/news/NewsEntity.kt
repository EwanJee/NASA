@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.news

import jakarta.persistence.*
import java.time.LocalDate

@Table(name = "news")
@Entity
class NewsEntity(
    topic: String,
    date: LocalDate,
    totalResults: Int,
    articles_kr: List<ArticleEntity>,
    articles_en: List<ArticleEntity>,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
        private set
}
