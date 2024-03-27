package com.project.nasa.setting.adapter.out.persistence.member.repository

import com.project.nasa.setting.adapter.out.persistence.member.entity.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleEntityRepository : JpaRepository<ArticleEntity,Long>{

}