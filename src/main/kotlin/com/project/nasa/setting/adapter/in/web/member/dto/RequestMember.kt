package com.project.nasa.setting.adapter.`in`.web.member.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotEmpty

data class RequestMember(
    @NotEmpty(message = "닉네임을 입력해주세요")
    val nickname : String,
    @Email(message = "이메일을 다시 입력해주세요")
    val email : String,
    @Min(value = 6, message = "비밀번호는 최소 ")
    val password : String
)