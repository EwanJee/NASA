package com.project.nasa.adapter.out.persistence.repository.member

import com.project.nasa.setting.adapter.out.persistence.entity.member.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberEntityRepository : JpaRepository<MemberEntity, Long> {
    fun existsByNickname(nickname: String): Boolean

    fun existsByEmail(email: String): Boolean
}
