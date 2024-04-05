package com.project.nasa.common.exception

abstract class BusinessException(
    val errorCode: ErrorCode
) : RuntimeException()