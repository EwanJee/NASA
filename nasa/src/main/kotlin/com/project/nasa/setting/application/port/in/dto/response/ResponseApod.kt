package com.project.nasa.setting.application.port.`in`.dto.response

import java.time.LocalDate

open class ResponseApod(
    var id : Long?,
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String
)