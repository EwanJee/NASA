@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.adapter.`in`.web.news

import com.nasa.todaynasa.application.port.`in`.news.NewsCommand
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RequestMapping("/api/v1/news")
@RestController
class NewsController(
    private val newsCommand: NewsCommand,
) {
    suspend fun showNewsByTopicAndDate(
        @RequestParam("q") topic: String,
        @RequestParam("date") date: LocalDate,
    ): ResponseEntity<EntityModel<*>> {
        // TODO newsCommand.getNewsByTopicAndDate(topic, date)
        val resource = EntityModel.of("")
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NewsController::class.java))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}
