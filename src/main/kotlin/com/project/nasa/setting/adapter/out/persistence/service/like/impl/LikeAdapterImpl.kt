package com.project.nasa.setting.adapter.out.persistence.service.like.impl

import com.project.nasa.setting.adapter.`in`.web.apod.dto.request.RequestLike
import com.project.nasa.setting.adapter.`in`.web.apod.dto.response.ResponseLike
import com.project.nasa.setting.adapter.out.persistence.service.like.LikeAdapter
import org.springframework.data.redis.core.SetOperations
import org.springframework.stereotype.Service

@Service
class LikeAdapterImpl(
    private val likeOps: SetOperations<String, String>
) : LikeAdapter {
    override fun pressLike(requestLike: RequestLike): ResponseLike {
        val key = "apod_likes:${requestLike.apodId}"
        val member = requestLike.memberId.toString()
        if (likeOps.isMember(key, member) == true) likeOps.remove(key, member)
        else likeOps.add(key, member)
        return ResponseLike(
            apodId = requestLike.apodId,
            size = likeOps.size(key) ?: 0L
        )
    }
}