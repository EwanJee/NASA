package com.project.nasa.application.port.`in`.usecase.apod

import com.project.nasa.domain.apod.Apod
import java.time.LocalDate

interface NasaApiUseCase {
    fun getApod(
        url: String,
        date: LocalDate,
    ): Apod
}

// todo: 패키지 위치가 port.in 인지 port.out 에 위치해야 할지 고민 필요
