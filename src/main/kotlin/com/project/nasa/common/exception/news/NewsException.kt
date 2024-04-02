package com.project.nasa.common.exception.news

import com.project.nasa.common.exception.ErrorCode

class NewsException(private val errorCode: ErrorCode) : RuntimeException()