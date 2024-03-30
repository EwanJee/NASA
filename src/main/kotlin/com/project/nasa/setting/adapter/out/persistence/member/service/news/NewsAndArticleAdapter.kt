package com.project.nasa.setting.adapter.out.persistence.member.service.news

import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
import java.time.LocalDate

interface NewsAndArticleAdapter {
    fun getByQAndDate(topic: String, date: LocalDate): ResponseNews?
    fun join(topic: String, date: LocalDate, requestNews: RequestNews): ResponseNews
}