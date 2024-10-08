package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.adapter.out.persistence.apod.QApodEntity.apodEntity
import com.nasa.todaynasa.application.port.out.apod.ApodQuery
import com.nasa.todaynasa.domain.Apod
import com.nasa.todaynasa.infrastructure.annotations.Adapter
import com.querydsl.jpa.impl.JPAQueryFactory
import java.time.LocalDate

@Adapter
class ApodPersistenceAdapter(
    private val apodRepository: ApodRepository,
    private val queryFactory: JPAQueryFactory,
) : ApodQuery {
    override fun getApodByDate(date: LocalDate): ApodEntity? =
        queryFactory
            .selectFrom(apodEntity)
            .where(apodEntity.date.eq(date))
            .fetchFirst()

    override fun saveApod(apod: Apod) {
        apodRepository.save(ApodEntity.from(apod))
    }
}
