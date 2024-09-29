@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")

package com.nasa.todaynasa.application.service.apod.request.apod

import com.nasa.todaynasa.domain.Apod
import java.time.LocalDate

data class RequestApod(
    val date: LocalDate,
    val explanationEN: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String,
    val hdurl: String,
) {
    companion object {
        fun of(
            requestApod: RequestApod,
            translated: String,
        ): Apod =
            Apod(
                date = requestApod.date,
                explanationEN = requestApod.explanationEN,
                mediaType = requestApod.media_type,
                title = requestApod.title,
                url = requestApod.url,
                hdurl = requestApod.hdurl,
                explanationKR = translated,
            )
    }
}
