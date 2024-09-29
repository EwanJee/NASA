package com.nasa.todaynasa.application.port.out.apod

interface ApodLikeQuery {
    fun isLiked(
        key: String,
        value: String,
    ): Boolean

    fun like(
        key: String,
        value: String,
    ): String

    fun unlike(
        key: String,
        value: String,
    ): String
}
