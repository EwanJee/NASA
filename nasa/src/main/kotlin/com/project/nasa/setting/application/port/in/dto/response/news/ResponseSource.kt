package com.project.nasa.setting.application.port.`in`.dto.response.news

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseSource(
    @JsonProperty("id")
    val id : String?,
    val name : String?
)