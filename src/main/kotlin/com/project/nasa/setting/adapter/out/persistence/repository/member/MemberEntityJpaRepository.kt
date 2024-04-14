package com.project.nasa.setting.adapter.out.persistence.repository.member

import com.project.nasa.setting.adapter.out.persistence.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberEntityJpaRepository : JpaRepository<MemberEntity, Long> {
    fun findByEmail(email: String): MemberEntity?
}