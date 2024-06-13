@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.apod

import java.time.LocalDate

interface ApodCommand {
    fun getApodByDate(date: LocalDate)
}
