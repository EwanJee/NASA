package com.project.nasa.setting.adapter.out.web.sse.controller

import com.project.nasa.setting.adapter.out.web.sse.repository.SseEmitters
import com.project.nasa.setting.adapter.out.web.sse.service.CounterAdapter
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter
import java.io.IOException
@Tag(name = "SSE 컨트롤러", description = "Server Sent Event 컨트롤러")
@RequestMapping("api/v1/sse")
@RestController
class SseController(
    private val emitters: SseEmitters
) {
    @Operation(summary = "SSE 연결", description = "Server Sent Event 연결")
    @GetMapping("/connect", produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun connect(): ResponseEntity<SseEmitter> {
        val emitter = SseEmitter()
        emitters.add(emitter)
        try {
            emitter.send(
                SseEmitter.event()
                    .name("connect")
                    .data("connected!")
            )
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
        return ResponseEntity.ok(emitter)
    }
}