package com.project.nasa.setting.application.port.out.data

data class NewsData(
    val totalResults : Int,
    val articles : List<ArticleData>
)