@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.member.dto

data class CreateMemberRequest(
    val nickname: String,
    val email: String,
    val password: String,
)
