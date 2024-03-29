package com.project.nasa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NasaApplication

fun main(args: Array<String>) {
	runApplication<NasaApplication>(*args)
}
