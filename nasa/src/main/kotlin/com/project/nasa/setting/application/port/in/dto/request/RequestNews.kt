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