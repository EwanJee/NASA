package com.nasa.todaynasa.application.service.apod

import com.nasa.todaynasa.application.port.`in`.apod.ApodCommand
import com.nasa.todaynasa.application.port.out.apod.ApodCommandPort
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ApodService(
    val apodCommandPort: ApodCommandPort,
) : ApodCommand {
    override fun getApodByDate(date: LocalDate) {
        TODO("Not yet implemented")
    }
}
