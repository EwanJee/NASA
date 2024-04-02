package com.project.nasa.common.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus, val code: String, val message: String) {
    // News API Web
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "N001", " 무료 API 정책 상 요청 횟수가 100이 넘어 조회가 불가능합니다.")

}