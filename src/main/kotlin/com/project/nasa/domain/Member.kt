package com.project.nasa.domain

import java.time.LocalDateTime

class Member(
    private val id: Long,
    private val nickname: String,
    private val email: String,
    private var password: String,
    private val created: LocalDateTime,
    private var role: String,
)
