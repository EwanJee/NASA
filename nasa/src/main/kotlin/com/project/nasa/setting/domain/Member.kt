package com.project.nasa.setting.domain

import jakarta.validation.constraints.Email
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

class Member(
    private val seq: Long,
    private val nickname: String,
    @Email
    private val email: String,
    private var password: String,
    @CreatedDate
    private val created: LocalDateTime,
    private var role: String
)