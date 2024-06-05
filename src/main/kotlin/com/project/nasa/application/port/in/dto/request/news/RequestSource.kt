package com.project.nasa.application.port.`in`.dto.request.news

import com.fasterxml.jackson.annotation.JsonProperty

data class RequestSource(
    @JsonProperty("id")
    val id: String?,
    val name: String?,
)
