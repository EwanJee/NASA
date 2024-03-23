package com.project.nasa.common.config.security

import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.security.Key

@RequiredArgsConstructor
@Component
class JwtTokenProvider {
    @Value("\${jwt.secret.key}")
    private val secretKey: String? = null;
    private val key: Key? = null;
}