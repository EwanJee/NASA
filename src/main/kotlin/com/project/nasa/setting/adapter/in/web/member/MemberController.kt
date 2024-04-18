package com.project.nasa.setting.adapter.`in`.web.member

import com.project.nasa.setting.adapter.`in`.web.member.dto.RequestMember
import com.project.nasa.setting.adapter.out.persistence.service.member.MemberService
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Tag(name = "회원 컨트롤러", description = "회원 컨트롤러")
@RequestMapping("api/v1/member")
@Controller
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping("/signup")
    fun signup(@RequestBody @Valid requestMember: RequestMember){
        memberService.createMember(requestMember)
    }
}