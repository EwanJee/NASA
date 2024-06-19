package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.QApodEntity.apodEntity
import com.nasa.todaynasa.application.port.out.apod.ApodCommandPort
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class ApodPersistenceAdapter(
    private val apodRepository: ApodRepository,
    private val queryFactory: JPAQueryFactory,
) : ApodCommandPort {
    override fun existsByDate(date: LocalDate): Boolean =
        queryFactory
            .selectFrom(apodEntity)
            .where(apodEntity.date.eq(date))
            .fetchFirst() != null

    override fun getApodByDate(date: LocalDate): ApodEntity? =
        queryFactory
            .selectFrom(apodEntity)
            .where(apodEntity.date.eq(date))
            .fetchFirst()
}
