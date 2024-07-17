@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.news

import jakarta.persistence.*

@Table(name = "article")
@Entity
class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
        private set
}
