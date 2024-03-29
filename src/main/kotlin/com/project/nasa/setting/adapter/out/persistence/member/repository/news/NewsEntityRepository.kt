package com.project.nasa.setting.adapter.out.persistence.member.repository.news

import com.project.nasa.setting.adapter.out.persistence.member.entity.news.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NewsEntityRepository : JpaRepository<NewsEntity,Long> {
}