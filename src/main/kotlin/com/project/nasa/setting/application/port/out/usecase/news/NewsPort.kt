package com.project.nasa.setting.application.port.out.usecase.news

import com.project.nasa.setting.application.port.out.response.news.NewsData
import java.time.LocalDate

interface NewsPort {
    suspend fun convertNewsApi(q: String, date: LocalDate, lang: String): NewsData
}