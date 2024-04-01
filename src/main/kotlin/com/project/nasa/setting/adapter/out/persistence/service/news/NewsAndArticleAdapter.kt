package com.project.nasa.setting.adapter.out.persistence.service.news

import com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews
import com.project.nasa.setting.application.port.out.response.news.NewsData
import java.time.LocalDate

interface NewsAndArticleAdapter {
    fun getByQAndDate(topic: String, date: LocalDate): ResponseNews?
    fun join(topic: String, date: LocalDate, newsData: NewsData): ResponseNews
}