package com.project.nasa.setting.adapter.out.persistence.service.apod

import com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod
import com.project.nasa.setting.application.port.out.response.apod.ApodData
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
interface ApodAdapter {
    fun getByDate(date: LocalDate): ResponseApod?
    fun join(apodData: ApodData): ResponseApod
    fun getExplanationById(id: Long): String
    fun updateTranslation(id: Long, translated: String) : String
    fun addOnetoStarPoint(id : Long) : Long
}