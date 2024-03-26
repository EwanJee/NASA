package com.project.nasa.setting.adapter.out.persistence.member.repository

import com.project.nasa.setting.adapter.out.persistence.member.entity.ApodEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface ApodRepository : JpaRepository<ApodEntity, Long> {
    fun findByDate(date: LocalDate) : ApodEntity?
}