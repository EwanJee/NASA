package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.application.port.out.apod.ApodCommandPort
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component

@Component
class ApodPersistenceAdapter(
    private val apodRepository: ApodRepository,
    private val queryFactory: JPAQueryFactory,
) : ApodCommandPort {
    fun h()  {
        queryFactory.from(QApodEntity.apodEntity).fetch()
    }
}
