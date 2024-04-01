package com.project.nasa.setting.application.port.out.response.news

import com.project.nasa.setting.application.port.out.response.news.ArticleData

data class NewsData(
    val totalResults : Int,
    val articles : List<ArticleData>
)