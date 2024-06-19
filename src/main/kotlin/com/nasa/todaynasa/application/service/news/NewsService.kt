package com.nasa.todaynasa.application.service.news

import com.nasa.todaynasa.application.port.`in`.news.NewsCommand
import com.nasa.todaynasa.application.port.out.news.NewsCommandPort
import org.springframework.stereotype.Service

@Service
class NewsService(
    private val newsCommandPort: NewsCommandPort,
) : NewsCommand
