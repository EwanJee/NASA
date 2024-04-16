package com.project.nasa.setting.adapter.out.persistence.service.like.impl

import com.project.nasa.setting.adapter.`in`.web.apod.dto.RequestLike
import com.project.nasa.setting.adapter.out.persistence.service.like.LikeAdapter
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.SetOperations
import org.springframework.stereotype.Service

@Service
class LikeAdapterImpl(
    private val redisTemplate: RedisTemplate<String, String>
) : LikeAdapter {
    private val likeOps: SetOperations<String, String> = redisTemplate.opsForSet()
    override fun pressLike(requestLike: RequestLike): Long {
        val key = "apod_likes:${requestLike.apodId}"
        val member = requestLike.memberId.toString()
        if(likeOps.isMember(key, member) == true)
            likeOps.remove(key,member)
        else likeOps.add(key,member)
        return likeOps.size(key) ?: 0L
    }
}