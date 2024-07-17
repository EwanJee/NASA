package com.nasa.todaynasa.adapter.out.persistence.news

import com.nasa.todaynasa.application.port.out.news.NewsCommandPort
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class NewsPersistenceAdapter : NewsCommandPort {
    override fun getNewsByTopicAndDate(
        topic: String,
        date: LocalDate,
    ) {
        TODO("Not yet implemented")
    }
}
