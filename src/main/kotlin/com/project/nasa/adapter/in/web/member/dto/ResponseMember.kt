package com.project.nasa.adapter.`in`.web.member.dto

import java.time.LocalDateTime

data class ResponseMember(
    val id: Long?,
    val nickname: String,
    val email: String,
    val created: LocalDateTime?,
)
