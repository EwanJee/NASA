package com.project.nasa.setting.adapter.out.persistence.member.service

import com.project.nasa.setting.adapter.out.persistence.member.entity.MemberEntity
import com.project.nasa.setting.adapter.out.persistence.member.repository.MemberJpaRepository
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class MemberSecurityService(
    private val memberRepository: MemberJpaRepository

) : UserDetailsService {
    override fun loadUserByUsername(email: String): MemberEntity {
        val member : MemberEntity = memberRepository.findByEmail(email) ?: throw Exception()
        return member
    }
}