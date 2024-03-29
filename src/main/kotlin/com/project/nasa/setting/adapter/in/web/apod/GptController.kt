package com.project.nasa.setting.adapter.`in`.web.apod

import com.project.nasa.setting.adapter.out.persistence.member.service.apod.ApodAdapter
import com.project.nasa.setting.application.port.`in`.usecase.apod.GptUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.context.annotation.Description
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Tag(name = "GPT Api 컨트롤러", description = "https://api.openai.com/v1/chat/completions 이용")
@RequestMapping("api/v1/nasa")
@RestController
class GptController(
    private val apodAdapter: ApodAdapter,
    private val gptUseCase: GptUseCase

) {
    @Operation(summary = "해당 설명문 번역하기", description = "해당 id에 해당하는 객체의 설명문을 번역한다")
    @Description("해당 id에 해당하는 객체의 설명문을 번역한다")
    @GetMapping("/apod/tr/{id}")
    fun updateTranslationInfo(@PathVariable("id") id: Long, @RequestParam("lang") lang : String) : ResponseEntity<EntityModel<String>> {
        val translated : String = gptUseCase.translateByLanguage(lang, apodAdapter.getExplanationById(id))
        val updateTranslation = apodAdapter.updateTranslation(id, translated)
        val resource = EntityModel.of(updateTranslation)
        val link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(GptController::class.java).updateTranslationInfo(id,lang))
        resource.add(link.withRel("self"))
        return ResponseEntity.ok(resource)
    }
}