package com.project.nasa.adapter.out.persistence.repository.news

import com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
interface NewsEntityRepository : JpaRepository<NewsEntity, Long> {
    fun findByTopicAndDate(
        topic: String,
        date: LocalDate,
    ): NewsEntity?
}
