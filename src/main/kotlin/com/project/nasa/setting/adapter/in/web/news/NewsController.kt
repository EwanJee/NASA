package com.project.nasa.setting.adapter.`in`.web.news

import com.project.nasa.setting.adapter.out.persistence.member.service.news.NewsAndArticleAdapter
import com.project.nasa.setting.application.port.`in`.usecase.news.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.news.RequestNews
import com.project.nasa.setting.application.port.`in`.dto.response.news.ResponseNews
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.context.annotation.Description
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
    private val newsUseCase: NewsUseCase,
    private val newsAndArticleAdapter: NewsAndArticleAdapter
) {
    @Operation(summary = "뉴스 불러오기", description = "q = 토픽, date = 날짜 에 맞는 뉴스 불러오기")
    @Description("뉴스 불러오기")
    @GetMapping("/")
    fun getAndJoinApi(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate
    ): ResponseEntity<EntityModel<ResponseNews>> {
        var api: ResponseNews? = newsAndArticleAdapter.getByQAndDate(q, date)
        if (api == null) {
            api = newsAndArticleAdapter.join(q,date,newsUseCase.getAndPutApi(q, date, "ko"))
        }
        val resource = EntityModel.of(api)
        val link =
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(NewsController::class.java).getAndJoinApi(q, date))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)

    }

    @Operation(summary = "뉴스 불러오기 (언어에 따라)", description = "q = 토픽, date = 날짜, lang = 언어 에 맞는 뉴스 불러오기")
    @Description("뉴스 불러오기 (언어에 따라)")
    @GetMapping("/{lang}")
    fun getAndJoinApiByLang(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate,
        @PathVariable lang: String
    ): ResponseEntity<EntityModel<RequestNews>> {
        val api: RequestNews = newsUseCase.getAndPutApi(q, date, "ko")
        val resource = EntityModel.of(api)
        val link = WebMvcLinkBuilder.linkTo(
            WebMvcLinkBuilder.methodOn(NewsController::class.java).getAndJoinApiByLang(q, date, lang)
        )
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}