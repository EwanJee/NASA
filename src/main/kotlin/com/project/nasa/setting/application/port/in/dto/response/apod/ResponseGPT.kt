package com.project.nasa.setting.application.port.`in`.dto.response.apod

import com.fasterxml.jackson.annotation.JsonProperty
import com.project.nasa.setting.application.port.`in`.dto.request.apod.Message

class ResponseGPT(
    @JsonProperty("choices")
    val choices: MutableList<Choice>
)

class Choice(
    @JsonProperty("index")
    val index: Int,
    @JsonProperty("message")
    val message: Message
)