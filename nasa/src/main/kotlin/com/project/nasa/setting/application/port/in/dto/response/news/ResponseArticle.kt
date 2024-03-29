package com.project.nasa.setting.application.port.`in`.dto.response.news

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseArticle(
    @JsonProperty("source")
    val source : ResponseSource?,
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