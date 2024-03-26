package com.project.nasa.setting.application.port.`in`.dto.request

import java.time.LocalDate

class RequestApod(
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String
)