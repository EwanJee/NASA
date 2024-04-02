package com.project.nasa.common.exception

import com.project.nasa.common.exception.news.NewsException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(NewsException::class)
    fun handleNewsException(newsException: NewsException): ResponseEntity<NewsException> {
        return ResponseEntity.badRequest().body(newsException)
    }
}