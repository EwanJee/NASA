package com.nasa.todaynasa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class TodaynasaApplication

fun main(args: Array<String>) {
    runApplication<TodaynasaApplication>(*args)
}
