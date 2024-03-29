package com.project.nasa.common.config.security


import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@Component
class JwtTokenProvider(
//    private val memberSecurityService: MemberSecurityService
) {
    @Value("\${jwt.secret.key}")
    private var secretKey: String = ""

    //토른 유효기간 30분
    private final val ACCESS_TOKEN_VALID_TIME: Long = 30 * 60 * 1000L
    private final val REFRESH_TOKEN_VALID_TIME: Long = 7 * 24 * 60 * 60 * 1000L

    @OptIn(ExperimentalEncodingApi::class)
    @PostConstruct
    protected fun init(){
        secretKey = Base64.encode(secretKey.toByteArray())
    }
}