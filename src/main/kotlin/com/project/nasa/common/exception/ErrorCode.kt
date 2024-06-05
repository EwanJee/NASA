package com.project.nasa.common.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus, val code: String, val message: String) {
    // News API Web
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "N001", " 무료 API 정책 상 요청 횟수가 100이 넘어 조회가 불가능합니다."),

    // Email API
    EMAIL_SEND_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "E001", "이메일 전송에 실패하였습니다."),

    //APOD
    APOD_NOT_FOUND(HttpStatus.NOT_FOUND, "A001", "사진이 아직 존재하지 않습니다"),

    //Member
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "M001", "해당 계정이 존재하지 않습니다"),

    //Like
    LIKE_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "L001", "이미 좋아요를 눌렀습니다")
}
