package com.project.nasa.setting.domain

import jakarta.validation.constraints.Email
import org.springframework.data.annotation.CreatedDate
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.time.LocalDateTime
import java.util.*


class Member(
    val seq: Long,
    val nickname: String,
    @Email
    val email: String,
    var password: String,
    @CreatedDate
    val created: LocalDateTime,
    var role: String
) : UserDetails {
    // 권한 체크 메서드. role = "MEMBER" || "ADMIN"
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return Collections.singleton(GrantedAuthority { role })
    }

    override fun getPassword(): String {
        return password
    }

    override fun getUsername(): String {
        return email
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}