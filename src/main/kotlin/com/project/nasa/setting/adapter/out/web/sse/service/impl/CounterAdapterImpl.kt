package com.project.nasa.setting.adapter.out.web.sse.service.impl

import com.project.nasa.setting.adapter.out.web.sse.repository.SseEmitters
import com.project.nasa.setting.adapter.out.web.sse.service.CounterAdapter
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class CounterAdapterImpl(
    private val sseEmitters: SseEmitters
) : CounterAdapter {
    private val counter = AtomicInteger(0)
    override fun increment(): Int {
        val count = counter.incrementAndGet()
        sseEmitters.sendToAll(count)
        return count
    }

    @Scheduled(cron = "0 0 0 * * *", zone = "America/New_York") // 매일 자정에 리셋
    fun reset() {
        counter.set(0)
    }

}