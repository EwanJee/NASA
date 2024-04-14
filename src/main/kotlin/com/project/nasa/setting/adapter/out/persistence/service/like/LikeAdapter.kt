package com.project.nasa.setting.adapter.out.persistence.service.like

import com.project.nasa.setting.adapter.`in`.web.apod.dto.RequestLike

interface LikeAdapter {
    fun pressLike(requestLike: RequestLike) : Int
}