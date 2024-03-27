package com.project.nasa.setting.application.port.`in`.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Size

data class RequestNews(
    @JsonProperty("totalResults")
    val totalResults: Int,
    @Size(max = 8)
    @JsonProperty("articles")
    val articles: List<RequestArticle>
)

data class RequestArticle(
    @JsonProperty("author")
    val author: String,
    @JsonProperty("title")
    val title: String,
    @JsonProperty("description")
    val description: String,
    @JsonProperty("url")
    val url: String,
    @JsonProperty("urlToImage")
    val image: String?,
    @JsonProperty("content")
    val content: String
)