package com.project.nasa.application.port.out.response.apod

import java.time.LocalDate

data class ApodData(
    val date: LocalDate,
    val explanation: String,
    val mediaType: String,
    val title: String,
    val url: String,
    val hdurl: String,
)
