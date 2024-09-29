package com.nasa.todaynasa.application.service.member

import com.nasa.todaynasa.application.port.`in`.member.MemberCommand
import com.nasa.todaynasa.application.port.`in`.member.dto.CreateMemberRequest
import com.nasa.todaynasa.application.port.out.member.MemberQuery
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberQuery: MemberQuery,
) : MemberCommand {
    override fun createMember(createMemberRequest: CreateMemberRequest) {
        TODO("Not yet implemented")
    }
}
