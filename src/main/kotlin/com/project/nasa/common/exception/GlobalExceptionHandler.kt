package com.project.nasa.common.exception

import com.project.nasa.common.exception.news.NewsException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(NewsException::class)
    fun handleNewsException(newsException: NewsException): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(newsException.errorCode.status, newsException.errorCode.code, newsException.errorCode.message)
        return ResponseEntity.status(newsException.errorCode.status).body(errorResponse)
    }
}