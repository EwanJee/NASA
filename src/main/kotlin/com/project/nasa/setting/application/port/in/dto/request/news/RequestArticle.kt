package com.project.nasa.setting.application.port.`in`.dto.request.news

import com.fasterxml.jackson.annotation.JsonProperty

data class RequestArticle(
    @JsonProperty("source")
    val source : RequestSource?,
    @JsonProperty("author")
    val author: String?,
    @JsonProperty("title")
    val title: String?,
    @JsonProperty("description")
    val description: String?,
    @JsonProperty("url")
    val url: String?,
    @JsonProperty("urlToImage")
    val image: String?,
    @JsonProperty("content")
    val content: String?
)