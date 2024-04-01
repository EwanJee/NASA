package com.project.nasa.setting.application.port.`in`.usecase.news

import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import java.time.LocalDate

interface NewsUseCase {
    fun getAndPutApi(q: String, date: LocalDate, lang: String): RequestNews
}