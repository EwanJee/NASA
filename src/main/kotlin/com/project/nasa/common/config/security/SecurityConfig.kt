package com.project.nasa.common.config.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@EnableWebSecurity // 모든 요청 URL이 스프링 시큐리티의 제어를 받도록 한다.
@Configuration
class SecurityConfig {
    @Bean
    fun filterChain(http: HttpSecurity): DefaultSecurityFilterChain {
        http
            .authorizeHttpRequests { requests ->
                requests.requestMatchers(AntPathRequestMatcher("/**")).permitAll()
            } // 인증되지 않은 모든 페이지의 요청 허락. 로그인 하지 않더라도 모든 페이지에 접근할 수 있다.
        return http.build()
    }
}