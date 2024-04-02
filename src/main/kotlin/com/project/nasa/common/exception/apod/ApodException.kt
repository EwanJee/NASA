package com.project.nasa.common.exception.apod

import com.project.nasa.common.exception.ErrorCode

class ApodException(private val errorCode: ErrorCode) : RuntimeException()