package com.project.nasa.setting.adapter.`in`.web.news

import com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter
import com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews
import com.project.nasa.setting.adapter.out.web.sse.repository.SseEmitters
import com.project.nasa.setting.adapter.out.web.sse.service.CounterAdapter
import com.project.nasa.setting.adapter.out.web.sse.service.impl.CounterAdapterImpl
import com.project.nasa.setting.application.port.out.usecase.news.NewsPort
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
    private val newsPort: NewsPort,
    private val newsAndArticleAdapter: NewsAndArticleAdapter,
    private val counterAdapter: CounterAdapter
) {
    @Operation(summary = "뉴스 불러오기", description = "q = 토픽, date = 날짜 에 맞는 뉴스 불러오기")
    @Description("뉴스 불러오기")
    @GetMapping("/")
    suspend fun getAndJoinApi(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate
    ): ResponseEntity<EntityModel<ResponseNews>> {
        var api: ResponseNews? = newsAndArticleAdapter.getByQAndDate(q, date)
        if (api == null) {
            api = newsAndArticleAdapter.join(q, date, newsPort.convertNewsApi(q, date, "ko"))
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
    suspend fun getAndJoinApiByLang(
        @RequestParam("q") q: String,
        @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate,
        @PathVariable lang: String
    ): ResponseEntity<EntityModel<ResponseNews>> {
        var api: ResponseNews? = newsAndArticleAdapter.getByQAndDate(q, date)
        if (api == null) {
            api = newsAndArticleAdapter.join(q, date, newsPort.convertNewsApi(q, date, lang))
            counterAdapter.increment() // counter 증가. == 뉴스 API 요청 횟수
        }
        val resource = EntityModel.of(api)
        val link = WebMvcLinkBuilder.linkTo(
            WebMvcLinkBuilder.methodOn(NewsController::class.java).getAndJoinApiByLang(q, date, lang)
        )
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}