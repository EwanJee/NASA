package com.project.nasa.adapter.out.sse.service.impl

import com.project.nasa.setting.adapter.out.sse.repository.SseEmitters
import com.project.nasa.setting.adapter.out.sse.service.CounterAdapter
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class CounterAdapterImpl(
    private val sseEmitters: SseEmitters,
) : CounterAdapter {
    private var counter = AtomicInteger(0)
    private val logger = LoggerFactory.getLogger(CounterAdapterImpl::class.java)

    override fun increment(): Int {
        val count = counter.incrementAndGet()
        sseEmitters.sendToAll(count)
        logger.info("Counter: $count")
        return count
    }

    @Scheduled(cron = "0 0 0 * * *", zone = "America/New_York") // 매일 자정에 리셋
    fun reset() {
        counter.set(0)
    }
}
