package com.project.nasa.setting.adapter.out.persistence.member.repository.news

import com.project.nasa.setting.adapter.out.persistence.member.entity.news.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface NewsEntityRepository : JpaRepository<NewsEntity,Long> {
    fun findByTopicAndDate(topic : String, date : LocalDate) : NewsEntity?
}