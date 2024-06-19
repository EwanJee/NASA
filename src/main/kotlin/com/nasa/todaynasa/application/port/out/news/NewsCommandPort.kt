package com.nasa.todaynasa.application.port.out.news

import java.time.LocalDate

interface NewsCommandPort {
    fun getNewsByTopicAndDate(
        topic: String,
        date: LocalDate,
    )
}
