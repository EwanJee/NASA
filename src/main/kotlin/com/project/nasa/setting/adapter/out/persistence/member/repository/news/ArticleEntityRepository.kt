package com.project.nasa.setting.adapter.out.persistence.member.repository.news

import com.project.nasa.setting.adapter.out.persistence.member.entity.news.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleEntityRepository : JpaRepository<ArticleEntity,Long>{

}