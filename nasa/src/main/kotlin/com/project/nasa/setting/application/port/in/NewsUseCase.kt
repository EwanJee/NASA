package com.project.nasa.setting.application.port.`in`

import com.project.nasa.setting.application.port.`in`.dto.request.RequestNews
import java.time.LocalDate

interface NewsUseCase {
    fun getAndPutApi(q : String, date : LocalDate) : RequestNews
    fun getHeadlines() : String?
}