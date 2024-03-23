package com.project.nasa.setting.adapter.out.persistence.member.service

import com.project.nasa.setting.adapter.out.persistence.member.repository.MemberRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class MemberSecurityService(
    private val memberRepository: MemberRepository
) : UserDetailsService {
    override fun loadUserByUsername(email: String): UserDetails {
        return memberRepository.findById(1L) //수정해야함
            .orElseThrow() //추가애햐됨
    }
}