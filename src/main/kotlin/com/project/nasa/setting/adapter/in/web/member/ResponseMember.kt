package com.project.nasa.setting.adapter.`in`.web.member

import java.time.LocalDateTime

data class ResponseMember(
    val id : Long?,
    val nickname : String,
    val email : String,
    val created : LocalDateTime?
)