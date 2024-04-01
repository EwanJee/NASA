package com.project.nasa.setting.adapter.out.persistence.service.dto.response

import java.time.LocalDate

data class ResponseApod(
    var id: Long?,
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val title: String,
    val url: String,
    val hdurl : String
)