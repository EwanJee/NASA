package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    private val nickname: String,
    @Email
    private val email: String,
    private var password: String,
    @CreatedDate
    private val created: LocalDateTime
)