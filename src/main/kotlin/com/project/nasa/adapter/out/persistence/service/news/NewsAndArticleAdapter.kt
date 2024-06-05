package com.project.nasa.adapter.out.persistence.service.news

import com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews
import com.project.nasa.setting.application.port.out.response.news.NewsData
import java.time.LocalDate

interface NewsAndArticleAdapter {
    fun getByQAndDate(
        topic: String,
        date: LocalDate,
        lang: String,
    ): ResponseNews?

    fun join(
        topic: String,
        date: LocalDate,
        newsData: NewsData,
    ): ResponseNews

    fun updateNewsEn(
        q: String,
        date: LocalDate,
        newsData: NewsData,
    ): ResponseNews
}
