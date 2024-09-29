@file:Suppress("ktlint:standard:annotation", "ktlint:standard:package-name")

package com.nasa.todaynasa.adapter.`in`.web.apod

import com.nasa.todaynasa.application.port.`in`.apod.ApodCommand
import com.nasa.todaynasa.application.port.`in`.apod.ApodLikeCommand
import com.nasa.todaynasa.application.port.`in`.apod.dto.RequestLike
import com.nasa.todaynasa.domain.Apod
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import kotlinx.serialization.json.JsonObject
import org.springframework.context.annotation.Description
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@Tag(name = "APOD 컨트롤러", description = "https://api.nasa.gov 에서 APOD 데이터 받기 컨트롤러")
@RequestMapping("/api/v1/apod")
@RestController
class ApodController(
    private val apodCommand: ApodCommand,
    private val apodLikeCommand: ApodLikeCommand,
) {
    @Operation(summary = "APOD 받기", description = "영문 & 한국 설명문이 포함된 apod 제시")
    @Description("API로부터 APOD를 받고 DB에 저장한다")
    @PostMapping("")
    suspend fun showApodByDate(
        @RequestParam("date") date: LocalDate,
    ): ResponseEntity<EntityModel<Apod>> {
        val apod = apodCommand.getApodByDate(date)
        val resource = EntityModel.of(apod)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ApodController::class.java))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }

    @Operation(summary = "APOD사진 메일로 보내기", description = "APOD 사진을 메일로 보내기")
    @Description("반환값은 JsonObject로 email, imageUrl, explanation을 포함한다")
    @PostMapping("/send")
    suspend fun sendImageToEmail(
        @RequestParam("date") date: LocalDate,
        @RequestBody email: String,
    ): ResponseEntity<EntityModel<JsonObject>> {
        val response = apodCommand.sendImageToEmail(date, email)
        val resource = EntityModel.of(response)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ApodController::class.java))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }

    @Operation(summary = "별점 올리기 or 내리기", description = "APOD 별점")
    @Description("해당 APOD의 LIKE 를 1 올려주거나 1을 감소한다")
    @PutMapping("/like")
    suspend fun updateLike(
        @RequestBody requestLike: RequestLike,
    ): ResponseEntity<EntityModel<String>> {
        val resource = EntityModel.of(apodLikeCommand.pressLike(requestLike))
        val link =
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ApodController::class.java).updateLike(requestLike))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}
