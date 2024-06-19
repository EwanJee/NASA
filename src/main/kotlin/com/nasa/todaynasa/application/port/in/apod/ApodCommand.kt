@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.apod

import com.nasa.todaynasa.domain.Apod
import java.time.LocalDate

interface ApodCommand {
    suspend fun getApodByDate(date: LocalDate): Apod
}
