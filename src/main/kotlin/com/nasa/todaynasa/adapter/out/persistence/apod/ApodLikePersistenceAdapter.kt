package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.application.port.out.apod.ApodLikeQuery
import com.nasa.todaynasa.infrastructure.annotations.Adapter
import org.springframework.data.redis.core.SetOperations

@Adapter
class ApodLikePersistenceAdapter(
    private val setOps: SetOperations<String, String>,
) : ApodLikeQuery {
    override fun isLiked(
        key: String,
        value: String,
    ): Boolean = setOps.isMember(key, value) == true

    override fun like(
        key: String,
        value: String,
    ): String {
        setOps.add(key, value)
        return "LIKE"
    }

    override fun unlike(
        key: String,
        value: String,
    ): String {
        setOps.remove(key, value)
        return "UNLIKE"
    }
}
