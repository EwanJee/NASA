package com.project.nasa.setting.application.port.`in`.dto.response

import com.project.nasa.setting.application.port.`in`.dto.request.RequestApod
import java.time.LocalDate

class ResponseApod(
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String
){
    fun convertToRequestApod() : RequestApod{
        return RequestApod(
            date = date,
            explanation = explanation,
            media_type = media_type,
            service_version = service_version,
            title = title,
            url = url
        )
    }
}