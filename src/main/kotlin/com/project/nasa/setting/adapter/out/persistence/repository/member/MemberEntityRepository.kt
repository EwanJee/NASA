package com.project.nasa.setting.adapter.out.persistence.repository.member

import com.project.nasa.setting.adapter.out.persistence.entity.member.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberEntityRepository : JpaRepository<MemberEntity, Long> {
    fun findByEmail(email: String): MemberEntity?
}