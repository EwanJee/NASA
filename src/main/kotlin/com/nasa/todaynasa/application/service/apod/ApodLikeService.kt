package com.nasa.todaynasa.application.service.apod

import com.nasa.todaynasa.application.port.`in`.apod.ApodLikeCommand
import com.nasa.todaynasa.application.port.`in`.apod.dto.RequestLike
import com.nasa.todaynasa.application.port.out.apod.ApodLikeQuery
import org.springframework.stereotype.Service

@Service
class ApodLikeService(
    private val apodLikeQuery: ApodLikeQuery,
) : ApodLikeCommand {
    override suspend fun pressLike(requestLike: RequestLike): String {
        val apodId = requestLike.apodId
        val memberId = requestLike.memberId.toString()
        val key = "apod_like:$apodId"
        if (apodLikeQuery.isLiked(key, memberId)) {
            return apodLikeQuery.unlike(key, memberId)
        }
        return apodLikeQuery.like(key, memberId)
    }
}
