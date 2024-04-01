package com.project.nasa.setting.adapter.out.persistence.service.apod

import com.project.nasa.setting.application.port.`in`.dto.response.apod.ResponseApod
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
interface ApodAdapter {
    fun getByDate(date: LocalDate): ResponseApod?
    fun join(responseApod: ResponseApod): ResponseApod
    fun getExplanationById(id: Long): String
    fun updateTranslation(id: Long, translated: String) : String
    fun addOnetoStarPoint(id : Long) : Long
}