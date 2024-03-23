package com.project.nasa.setting.adapter.out.persistence.member.repository

import com.project.nasa.setting.adapter.out.persistence.member.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberJpaRepository : JpaRepository<MemberEntity, Long> {
    fun findByEmail(email: String): MemberEntity?
}