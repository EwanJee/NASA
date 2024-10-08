package com.nasa.todaynasa.infrastructure.configuration.querydsl

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QueryDslConfig {
    val em: EntityManager? = null

    @Bean
    fun queryFactory(): JPAQueryFactory = JPAQueryFactory(em)
}
