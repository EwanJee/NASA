package com.project.nasa.adapter.out.persistence.service.apod

import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail
import com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod
import com.project.nasa.setting.application.port.out.response.apod.ApodData
import java.time.LocalDate

interface ApodAdapter {
    fun getByDate(date: LocalDate): ResponseApod?

    fun join(apodData: ApodData): ResponseApod

    fun getExplanationById(id: Long): String

    fun updateTranslation(
        id: Long,
        translated: String,
    ): String

    fun sendImageToEmail(
        id: Long,
        email: String,
    ): ResponseEmail
}

// todo: Adapter? PortAndAdapter 에서 사용하는 상징적인 표현들에 대해서 스터디 후 변경 필요
