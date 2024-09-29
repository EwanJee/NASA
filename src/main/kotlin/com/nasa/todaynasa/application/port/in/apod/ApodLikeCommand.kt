package com.nasa.todaynasa.application.port.`in`.apod

import com.nasa.todaynasa.application.port.`in`.apod.dto.RequestLike

interface ApodLikeCommand {
    suspend fun pressLike(requestLike: RequestLike): String
}
