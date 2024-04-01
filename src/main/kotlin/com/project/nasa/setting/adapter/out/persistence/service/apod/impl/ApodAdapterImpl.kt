package com.project.nasa.setting.adapter.out.persistence.service.apod.impl

import com.project.nasa.setting.adapter.out.persistence.entity.apod.ApodEntity
import com.project.nasa.setting.adapter.out.persistence.repository.apod.ApodEntityRepository
import com.project.nasa.setting.adapter.out.persistence.service.apod.ApodAdapter
import com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod
import com.project.nasa.setting.application.port.out.response.apod.ApodData
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
            title = apodEntity.title,
            url = apodEntity.url,
            hdurl = apodEntity.hdurl
        )
    }

    @Transactional
    override fun join(apodData: ApodData): ResponseApod {
        val apodEntity = ApodEntity(
            date = apodData.date,
            explanation = apodData.explanation,
            media_type = apodData.mediaType,
            title = apodData.title,
            url = apodData.url,
            hdurl = apodData.hdurl
        )
        val saved = apodEntityRepository.save(apodEntity)
        return ResponseApod(
            id = saved.id,
            date = saved.date,
            explanation = saved.explanation,
            media_type = saved.media_type,
            title = saved.title,
            url = saved.url,
            hdurl = saved.hdurl
        )
    }

    override fun getExplanationById(id: Long): String {
        return apodEntityRepository.findById(id).get().explanation
    }

    @Transactional
    override fun updateTranslation(id: Long, translated: String): String {
        val stored = apodEntityRepository.findById(id)
            .orElseThrow { IllegalArgumentException("해당 정보가 존재하지 않습니다") }
        if (stored.explanation.isBlank()) return stored.translatedExplanation!!
        stored.updateTranslation(translated)
        val translatedExplanation = stored.translatedExplanation ?: throw IllegalArgumentException("")
        return translatedExplanation
    }

    @Transactional
    override fun addOnetoStarPoint(id: Long): Long {
        val stored: ApodEntity = apodEntityRepository.findById(id)
            .orElseThrow { IllegalArgumentException("해당 정보가 존재하지 않습니다") }
        return stored.addOneToStarPoint()
    }
}