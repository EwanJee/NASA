package com.nasa.todaynasa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodaynasaApplication

fun main(args: Array<String>) {
	runApplication<TodaynasaApplication>(*args)
}
