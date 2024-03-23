package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import org.springframework.data.annotation.CreatedDate
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.time.LocalDateTime
import java.util.*

@Entity
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private val seq: Long,
    private val nickname: String,
    @Email
    private val email: String,
    private var password: String,
    @CreatedDate
    private val created: LocalDateTime,
    private var role: String
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