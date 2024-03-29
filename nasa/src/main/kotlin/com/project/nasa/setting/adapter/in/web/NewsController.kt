package com.project.nasa.setting.adapter.`in`.web

import com.project.nasa.setting.application.port.`in`.NewsUseCase
import com.project.nasa.setting.application.port.`in`.dto.request.RequestNews
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
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
    ) : RequestNews {
        return newsUseCase.getAndPutApi(q,date)
    }
}