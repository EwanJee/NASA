package com.project.nasa.common.exception.news

import com.project.nasa.common.exception.ErrorCode

data class NewsException(val errorCode: ErrorCode) : RuntimeException()