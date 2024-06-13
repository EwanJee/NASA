package com.nasa.todaynasa.adapter.out.persistence.apod

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApodRepository : JpaRepository<ApodEntity, Long>
