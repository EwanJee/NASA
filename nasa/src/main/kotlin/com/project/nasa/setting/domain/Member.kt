package com.project.nasa.setting.domain

import jakarta.validation.constraints.Email
import org.springframework.data.annotation.CreatedDate
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.time.LocalDateTime
import java.util.*


class Member(
    private val seq: Long,
    private val nickname: String,
    @Email
    private val email: String,
    private var password: String,
    @CreatedDate
    private val created: LocalDateTime,
    private var role: String
) {
}