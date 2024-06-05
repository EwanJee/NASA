package com.project.nasa.common.config.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter
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
            .csrf { csrf -> csrf.ignoringRequestMatchers(AntPathRequestMatcher("/api/**")) }
        /*
         * csrf : 사용자가 웹사이트에 로그인한 상태에서 공격자가 준비한 악성 웹사이트나 이메일 등을 통해 사용자의 브라우저가 자동으로 요청을 보내도록 하는 것
         * csrf 토큰을 발행하는 기능이 없는 Swagger는 예외 처리 (/api/**) csrf 토큰 검증 무시
         */
         */
            .headers { headers -> headers.addHeaderWriter(XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN)) }
        // header -> X-Frame-Options 헤더의 값으로 SAMEORIGIN 으로 설정하면 프레임에 포함된 웹 페이지가 동일한 사이트에서 제공할 때만 사용이 허락
        return http.build()
    }
}
