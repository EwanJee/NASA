package com.project.nasa.setting.adapter.out.persistence.member.service

import com.project.nasa.setting.application.port.`in`.dto.response.ResponseApod
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
interface ApodService {
    fun getByDate(date: LocalDate) : ResponseApod?
    fun join(responseApod: ResponseApod) : Long?
}