package com.project.nasa.setting.adapter.`in`.web

import com.project.nasa.setting.domain.Member
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@Tag(name = "Example", description = "Example API")
@RestController
@RequestMapping("api/v1/example")
class HelloController {
    @GetMapping("")
    @Operation(summary = "Example API Summary", description = "Description")
    fun Hello(): String {
        return "ss"
    }
}