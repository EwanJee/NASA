package com.nasa.todaynasa.application.port.out.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.ApodEntity
import com.nasa.todaynasa.domain.Apod
import java.time.LocalDate

interface ApodQuery {
    fun getApodByDate(date: LocalDate): ApodEntity?

    fun saveApod(apod: Apod)
}
