@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.news

import com.nasa.todaynasa.adapter.out.persistence.common.BaseEntity
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
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
        private set
}
