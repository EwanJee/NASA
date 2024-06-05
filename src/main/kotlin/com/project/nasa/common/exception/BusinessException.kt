package com.project.nasa.common.exception

abstract class BusinessException(
    val errorCode: ErrorCode,
    val exception:Throwable? = null
) : RuntimeException(errorCode.message, exception)
