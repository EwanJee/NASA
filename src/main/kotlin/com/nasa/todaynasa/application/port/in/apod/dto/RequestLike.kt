@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.apod.dto

data class RequestLike(
    val apodId: Long,
    val memberId: Long,
)
