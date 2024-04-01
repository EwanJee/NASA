package com.project.nasa.setting.adapter.out.persistence.service.apod.impl

import com.project.nasa.setting.adapter.out.persistence.entity.apod.ApodEntity
import com.project.nasa.setting.adapter.out.persistence.repository.apod.ApodEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.apod.ApodAdapter
import com.project.nasa.setting.application.port.`in`.dto.response.apod.ResponseApod
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Transactional(readOnly = true)
@Service
class ApodAdapterImpl(
    private val apodEntityRepository: ApodEntityRepository
) : ApodAdapter {
    override fun getByDate(date: LocalDate): ResponseApod? {
        val apodEntity: ApodEntity = apodEntityRepository.findByDate(date) ?: return null
        return ResponseApod(
            id = apodEntity.id,
            date = apodEntity.date,
            explanation = apodEntity.explanation,
            media_type = apodEntity.media_type,
            service_version = apodEntity.service_version,
            title = apodEntity.title,
            url = apodEntity.url
        )
    }

    @Transactional
    override fun join(responseApod: ResponseApod): ResponseApod {
        val apodEntity = ApodEntity(
            date = responseApod.date,
            explanation = responseApod.explanation,
            media_type = responseApod.media_type,
            service_version = responseApod.service_version,
            title = responseApod.title,
            url = responseApod.url
        )
        val saved = apodEntityRepository.save(apodEntity)
        responseApod.id = saved.id
        return responseApod
    }

    override fun getExplanationById(id: Long): String {
        return apodEntityRepository.findById(id).get().explanation
    }

    @Transactional
    override fun updateTranslation(id: Long, translated: String): String {
        val stored = apodEntityRepository.findById(id).orElseThrow { IllegalArgumentException("해당 정보가 존재하지 않습니다") }
        if (stored.explanation.isBlank()) return stored.translatedExplanation!!
        stored.updateTranslation(translated)
        val translatedExplanation = stored.translatedExplanation ?: throw IllegalArgumentException("")
        return translatedExplanation
    }

    @Transactional
    override fun addOnetoStarPoint(id: Long): Long {
        val stored: ApodEntity = apodEntityRepository.findById(id)
            .orElseThrow({ IllegalArgumentException("해당 정보가 존재하지 않습니다") })
        return stored.addOneToStarPoint()
    }
}