@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")
package com.nasa.todaynasa.application.port.`in`.apod.dto.request

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
