@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")

package com.nasa.todaynasa.adapter.`in`.web.apod

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "APOD 컨트롤러", description = "https://api.nasa.gov 에서 APOD 데이터 받기 컨트롤러")
@RequestMapping("/api/v1/apod")
@RestController
class ApodController() {
    fun getApod() {
        println("getApod")
    }
}
