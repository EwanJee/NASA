package com.project.nasa.setting.adapter.out.persistence.member.repository

import com.project.nasa.setting.adapter.out.persistence.member.entity.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NewsEntityRepository : JpaRepository<NewsEntity,Long> {
}