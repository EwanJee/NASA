package com.project.nasa.setting.adapter.out.web.sse.service

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class CounterService {
    private val counter = AtomicInteger(0)
    fun increment(): Int {
        return counter.incrementAndGet()
    }

    @Scheduled(cron = "0 0 0 * * *", zone = "America/New_York") // 매일 자정에 리셋
    fun reset() {
        counter.set(0)
    }

}