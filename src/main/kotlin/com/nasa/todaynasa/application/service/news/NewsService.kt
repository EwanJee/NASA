package com.nasa.todaynasa.application.service.news

import com.nasa.todaynasa.application.port.`in`.news.NewsCommand
import com.nasa.todaynasa.application.port.out.news.NewsCommandPort
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class NewsService(
    private val newsCommandPort: NewsCommandPort,
) : NewsCommand {
    override suspend fun getNewsByTopicAndDate(
        topic: String,
        date: LocalDate,
    ) {
        TODO("Not yet implemented")
    }
}
