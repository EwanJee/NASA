package com.project.nasa.adapter.out.persistence.service.like

import com.project.nasa.setting.adapter.`in`.web.apod.dto.request.RequestLike
import com.project.nasa.setting.adapter.`in`.web.apod.dto.response.ResponseLike

interface LikeAdapter {
    fun pressLike(requestLike: RequestLike): ResponseLike
}
