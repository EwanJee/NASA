package com.nasa.todaynasa.adapter.`in`.web.handler

import com.nasa.todaynasa.domain.exception.BusinessException
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException::class)
    fun handleBusinessException(businessException: BusinessException): ResponseEntity<JsonObject> {
        val errorResponse =
            buildJsonObject {
                put("status", businessException.errorCode.status.toString())
                put("code", businessException.errorCode.code)
                put("message", businessException.errorCode.message)
            }
        return ResponseEntity.status(businessException.errorCode.status).body(errorResponse)
    }
}
