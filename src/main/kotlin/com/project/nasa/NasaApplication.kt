package com.project.nasa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class NasaApplication

fun main(args: Array<String>) {
	runApplication<NasaApplication>(*args)
}
