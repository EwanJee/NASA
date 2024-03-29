package com.project.nasa.setting.application.port.`in`.dto.request

import com.fasterxml.jackson.annotation.JsonProperty

data class RequestSource(
    @JsonProperty("id")
    val id : String?,
    val name : String?
)