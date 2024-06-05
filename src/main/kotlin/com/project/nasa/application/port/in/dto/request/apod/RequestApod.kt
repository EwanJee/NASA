package com.project.nasa.application.port.`in`.dto.request.apod

import java.time.LocalDate

data class RequestApod(
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String,
    val hdurl: String,
)
