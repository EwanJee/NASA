package com.project.nasa.setting.application.port.`in`.dto.request.news

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Size

data class RequestNews(
    @JsonProperty("totalResults")
    var totalResults: Int,
    @Size(max = 8)
    @JsonProperty("articles")
    var articles: List<RequestArticle>
)