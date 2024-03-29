package com.project.nasa.setting.application.port.`in`

import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
import java.time.LocalDate

interface NewsUseCase {
    fun getAndPutApi(q: String, date: LocalDate, lang: String): ResponseNews
    fun getHeadlines(): String?
}