package com.project.nasa.setting.adapter.out.persistence.repository.news

import com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleEntityRepository : JpaRepository<ArticleEntity, Long> {

}