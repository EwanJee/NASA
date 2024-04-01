package com.project.nasa.setting.application.port.out.usecase

import com.project.nasa.setting.application.port.out.data.NewsData
import java.time.LocalDate

interface NewsPort {
    fun sendNewsApi(q: String, date: LocalDate, lang: String): NewsData
}