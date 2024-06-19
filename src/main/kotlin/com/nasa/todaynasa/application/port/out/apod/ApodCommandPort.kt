package com.nasa.todaynasa.application.port.out.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.ApodEntity
import java.time.LocalDate

interface ApodCommandPort {
    fun existsByDate(date: LocalDate): Boolean

    fun getApodByDate(date: LocalDate): ApodEntity?
}
