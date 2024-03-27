package com.project.nasa.setting.adapter.`in`.web

import com.project.nasa.setting.adapter.out.persistence.member.service.ApodAdapter
import com.project.nasa.setting.application.port.`in`.GptUseCase
import io.swagger.v3.oas.annotations.tags.Tag
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
    @GetMapping("/apod/{id}")
    fun updateTranslationInfo(@PathVariable("id") id: Long, @RequestParam("lang") lang : String) : ResponseEntity<String> {
        val translated : String = gptUseCase.translateByLanguage(lang, apodAdapter.getExplanationById(id))
        val updateTranslation = apodAdapter.updateTranslation(id, translated)
        return ResponseEntity.ok(updateTranslation)
    }
}