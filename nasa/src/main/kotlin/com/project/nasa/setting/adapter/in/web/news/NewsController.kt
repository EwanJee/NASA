package com.project.nasa.setting.adapter.`in`.web.news

import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@Tag(name = "News Api 컨트롤러", description = "https://newsapi.org/v2/everything 에서 데이터 받기 컨트롤러")
@RequestMapping("/api/v1/news")
@RestController
class NewsController(
    private val newsUseCase: NewsUseCase
) {
    @GetMapping("")
    fun getAndJoinApi(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate
    ): ResponseEntity<EntityModel<ResponseNews>> {
        val api : ResponseNews = newsUseCase.getAndPutApi(q, date, "ko")
        val resource = EntityModel.of(api)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NewsController::class.java).getAndJoinApi(q,date))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)

    }

    @GetMapping("/{lang}")
    fun getAndJoinApiByLang(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate,
        @PathVariable lang: String
    ): ResponseEntity<EntityModel<ResponseNews>> {
        val api : ResponseNews = newsUseCase.getAndPutApi(q, date, "ko")
        val resource = EntityModel.of(api)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NewsController::class.java).getAndJoinApiByLang(q,date,lang))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}