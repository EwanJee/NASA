package com.project.nasa.common.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException::class)
    fun handleNewsException(businessException: BusinessException): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(
            businessException.errorCode.status,
            businessException.errorCode.code,
            businessException.errorCode.message
        )
        return ResponseEntity.status(businessException.errorCode.status).body(errorResponse)
    }
}