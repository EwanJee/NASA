package com.project.nasa.adapter.`in`.web.apod

import com.project.nasa.setting.adapter.out.persistence.service.apod.ApodAdapter
import com.project.nasa.setting.application.port.out.usecase.gpt.GptPort
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.context.annotation.Description
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Tag(name = "GPT Api 컨트롤러", description = "https://api.openai.com/v1/chat/completions 이용")
@RequestMapping("api/v1/nasa")
@RestController
class GptController(
    private val apodAdapter: ApodAdapter,
    private val gptPort: GptPort,
) {
    @Operation(summary = "해당 설명문 번역하기", description = "해당 id에 해당하는 객체의 설명문을 번역한다")
    @Description("해당 id에 해당하는 객체의 설명문을 번역한다")
    @GetMapping("/apod/tr/{id}")
    fun updateTranslationInfo(
        @PathVariable("id") id: Long,
        @RequestParam("lang") lang: String,
    ): ResponseEntity<String> {
        val updateTranslation =
            apodAdapter.updateTranslation(
                id = id,
                translated =
                    gptPort.getTranslation(
                        lang = lang,
                        content = apodAdapter.getExplanationById(id),
                    ),
            )
        return ResponseEntity.ok(updateTranslation)
    }
}

// todo: API Method 는 GET 인데 메서드 명은 Update?
