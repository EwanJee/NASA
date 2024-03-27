package com.project.nasa.common.config.webclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient
import java.time.Duration

@Configuration
class WebClientConfig {
    @Value("\${chatGpt.url}")
    private lateinit var url: String

    @Value("\${chatGpt.key}")
    private lateinit var key: String

    @Value("\${news.url}")
    private lateinit var newsUrl: String

    @Bean
    fun nasaClient(): WebClient {
        return WebClient.create()
    }

    @Bean
    fun gptClient(): WebClient {
        val client = HttpClient.create().responseTimeout(Duration.ofSeconds(45))
        return WebClient.builder()
            .clientConnector(ReactorClientHttpConnector(client))
            .baseUrl(url)
            .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
            .defaultHeader("Authorization", "Bearer $key")
            .build()
    }

    @Bean
    fun newsClient(): WebClient {
        return WebClient.builder()
            .baseUrl(newsUrl)
            .build()
    }
}