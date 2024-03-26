package com.project.nasa.setting.adapter.out.persistence.member.service.impl

import com.project.nasa.setting.adapter.out.persistence.member.entity.ApodEntity
import com.project.nasa.setting.adapter.out.persistence.member.repository.ApodRepository
import com.project.nasa.setting.adapter.out.persistence.member.service.ApodService
import com.project.nasa.setting.application.port.`in`.dto.request.RequestApod
import com.project.nasa.setting.application.port.`in`.dto.response.ResponseApod
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.time.LocalDate
@Service
class ApodServiceImpl(
    private val apodRepository: ApodRepository
) : ApodService {
    override fun getByDate(date: LocalDate) : ResponseApod? {
        val apodEntity : ApodEntity = apodRepository.findByDate(date) ?: return null
        return ResponseApod(
            date = apodEntity.date,
            explanation = apodEntity.explanation,
            media_type = apodEntity.media_type,
            service_version = apodEntity.service_version,
            title = apodEntity.title,
            url = apodEntity.url
        )
    }

    override fun join(responseApod: ResponseApod): Long? {
        val apodEntity : ApodEntity = ApodEntity(
            date = responseApod.date,
            explanation = responseApod.explanation,
            media_type = responseApod.media_type,
            service_version = responseApod.service_version,
            title = responseApod.title,
            url = responseApod.url
        )
        return apodRepository.save(apodEntity).id
    }
}