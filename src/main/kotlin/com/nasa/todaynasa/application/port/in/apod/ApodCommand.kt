@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.apod

import com.nasa.todaynasa.domain.Apod
import kotlinx.serialization.json.JsonObject
import java.time.LocalDate

interface ApodCommand {
    suspend fun getApodByDate(date: LocalDate): Apod

    suspend fun sendImageToEmail(
        date: LocalDate,
        email: String,
    ): JsonObject
}
