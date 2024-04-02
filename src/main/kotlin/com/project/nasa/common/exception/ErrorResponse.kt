package com.project.nasa.common.exception

import org.springframework.http.HttpStatus

data class ErrorResponse(val status : HttpStatus, val code : String, val message : String)