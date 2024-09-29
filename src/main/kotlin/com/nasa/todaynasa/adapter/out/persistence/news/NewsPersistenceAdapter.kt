package com.nasa.todaynasa.adapter.out.persistence.news

import com.nasa.todaynasa.application.port.out.news.NewsCommandPort
import com.nasa.todaynasa.infrastructure.annotations.Adapter
import java.time.LocalDate

@Adapter
class NewsPersistenceAdapter : NewsCommandPort {
    override fun getNewsByTopicAndDate(
        topic: String,
        date: LocalDate,
    ) {
        TODO("Not yet implemented")
    }
}
