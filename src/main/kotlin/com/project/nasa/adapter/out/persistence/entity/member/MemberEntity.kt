package com.project.nasa.adapter.out.persistence.entity.member

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Table(name = "member")
@Entity
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Long?,
    @Column(name = "nickname", unique = true)
    var nickname: String,
    @Email
    @Column(name = "email", unique = true)
    val email: String,
    @Min(value = 6)
    @Column(name = "password")
    var password: String,
    @CreatedDate
    @Column(name = "created")
    val created: LocalDateTime?,
) {
    fun updateNickname(name: String) {
        this.nickname = name
    }
}
