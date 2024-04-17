package com.project.nasa.setting.adapter.out.persistence.service.member.impl

import com.project.nasa.setting.adapter.out.persistence.repository.member.MemberEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.member.MemberService
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberEntityRepository: MemberEntityRepository
) : MemberService {

}