package com.project.nasa.application.port.out.response.news

data class NewsData(
    val totalResults: Int,
    val articles: List<ArticleData>,
)
