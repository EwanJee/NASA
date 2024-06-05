package com.project.nasa.adapter.out.persistence.service.member

import com.project.nasa.setting.adapter.`in`.web.member.dto.RequestMember
import com.project.nasa.setting.adapter.`in`.web.member.dto.ResponseMember

interface MemberService {
    fun createMember(requestMember: RequestMember): ResponseMember
}
