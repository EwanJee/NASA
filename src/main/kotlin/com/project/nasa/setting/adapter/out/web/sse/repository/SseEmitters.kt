package com.project.nasa.setting.adapter.out.web.sse.repository


import org.springframework.stereotype.Component
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter
import java.util.concurrent.CopyOnWriteArrayList

@Component
class SseEmitters(
    private val emitters: MutableList<SseEmitter> = CopyOnWriteArrayList() // thread-safe 한 리스트
) {
    fun add(emitter: SseEmitter): SseEmitter {
        emitters.add(emitter)
        emitter.onCompletion { this.emitters.remove(emitter) } // 만료되면 리스트에서 삭제
        emitter.onTimeout { emitter.complete() }
        return emitter
    }
    fun sendToAll(data: Any) {
        emitters.forEach { emitter ->
            try {
                emitter.send(SseEmitter.event()
                    .name("count")
                    .data(data))
            } catch (e: Exception) {
                emitters.remove(emitter)
            }
        }
    }
}