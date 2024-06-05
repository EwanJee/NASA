package com.project.nasa.application.port.`in`.usecase.news

import com.project.nasa.domain.news.News
import java.time.LocalDate

interface NewsUseCase {
    suspend fun getAndPutApi(
        q: String,
        date: LocalDate,
        lang: String,
    ): News
}
