package com.project.nasa.setting.adapter.out.persistence.service.member.impl

import com.project.nasa.setting.adapter.`in`.web.member.dto.RequestMember
import com.project.nasa.setting.adapter.`in`.web.member.dto.ResponseMember
import com.project.nasa.setting.adapter.out.persistence.entity.member.MemberEntity
import com.project.nasa.setting.adapter.out.persistence.repository.member.MemberEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.member.MemberService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberEntityRepository: MemberEntityRepository
) : MemberService {
    fun checkNickname(nickname: String) : Boolean {
        return memberEntityRepository.existsByNickname(nickname)
    }
    fun checkEmail(email : String) : Boolean {
        return memberEntityRepository.existsByEmail(email)
    }
    fun createMember(nickname: String, email: String, password: String): ResponseMember {
        val passwordEncoder: BCryptPasswordEncoder = BCryptPasswordEncoder()
        val member: MemberEntity = MemberEntity(
            id = null,
            nickname = nickname,
            email = email,
            password = passwordEncoder.encode(password),
            created = null
        )
        val saved = memberEntityRepository.save(member)
        return ResponseMember(
            id = saved.id,
            nickname = saved.nickname,
            email = saved.email,
            created = saved.created
        )
    }

    override fun createMember(requestMember: RequestMember): ResponseMember {
        TODO("Not yet implemented")
    }
}