package com.nasa.todaynasa.adapter.`in`.web.member

import com.nasa.todaynasa.application.port.`in`.member.MemberCommand
import com.nasa.todaynasa.application.port.`in`.member.dto.CreateMemberRequest
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "회원 컨트롤러", description = "회원 정보 관리 컨트롤러")
@RequestMapping("/api/v1/member")
@RestController
class MemberController(
    private val memberCommand: MemberCommand,
) {
    fun createMember(
        @RequestBody createMemberRequest: CreateMemberRequest,
    ) {
        memberCommand.createMember(createMemberRequest)
    }
}
