package com.project.nasa.setting.adapter.out.persistence.service.news.dto

import com.project.nasa.setting.application.port.out.data.ArticleData
import java.time.LocalDate

class ResponseNews(
    var id: Long?,
    var totalResults: Int,
    var topic: String,
    var date: LocalDate,
    var articles: List<ArticleData>
)