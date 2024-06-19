@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.apod.dto.request

import com.nasa.todaynasa.domain.Apod
import java.time.LocalDate

data class RequestApod(
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String,
    val hdurl: String,
) {
    companion object {
        fun from(requestApod: RequestApod): Apod =
            Apod(
                date = requestApod.date,
                explanation = requestApod.explanation,
                mediaType = requestApod.media_type,
                title = requestApod.title,
                url = requestApod.url,
                hdurl = requestApod.hdurl,
                translatedExplanation = null,
            )
    }
}
