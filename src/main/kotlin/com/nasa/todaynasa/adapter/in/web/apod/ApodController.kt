@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")

package com.nasa.todaynasa.adapter.`in`.web.apod

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/apod")
@RestController
class ApodController() {
    fun getApod() {
        println("getApod")
    }
}
