package com.project.nasa.setting.adapter.out.persistence.member.repository.apod

import com.project.nasa.setting.adapter.out.persistence.member.entity.apod.ApodEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface ApodEntityRepository : JpaRepository<ApodEntity, Long> {
    fun findByDate(date: LocalDate) : ApodEntity?
}