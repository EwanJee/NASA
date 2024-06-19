@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.news

import java.time.LocalDate

interface NewsCommand {
    suspend fun getNewsByTopicAndDate(
        topic: String,
        date: LocalDate,
    )
}
