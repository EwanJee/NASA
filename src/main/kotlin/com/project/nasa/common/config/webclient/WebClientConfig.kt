package com.project.nasa.common.config.webclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.DefaultUriBuilderFactory
import reactor.netty.http.client.HttpClient
import java.time.Duration

@Configuration
class WebClientConfig(
    @Value("\${chatGpt.url}")
    private val url: String,
    @Value("\${chatGpt.key}")
    private val key: String,
    @Value("\${news.url}")
    private val newsUrl: String,
    @Value("\${news.key}")
    private val newsKey: String,
) {
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
            .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
            .uriBuilderFactory(DefaultUriBuilderFactory("$newsUrl?apiKey=$newsKey"))
            .build()
    }
}
