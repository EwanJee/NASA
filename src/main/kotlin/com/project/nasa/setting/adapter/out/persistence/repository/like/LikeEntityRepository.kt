package com.project.nasa.setting.adapter.out.persistence.repository.like

import com.project.nasa.setting.adapter.out.persistence.entity.like.LikeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LikeEntityRepository : JpaRepository<LikeEntity, Long> {
    fun existsByMemberIdAndApodId(memberId: Long, apodId: Long): Boolean
    fun findByMemberIdAndApodId(memberId: Long, apodId: Long) : LikeEntity
}