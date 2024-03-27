package com.project.nasa.setting.adapter.out.persistence.member.entity

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
@Table(name = "MEMBER")
@Entity
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Long? = null,
    @Column(name = "nickname")
    var nickname: String,
    @Email
    @Column(name = "email")
    val email: String,
    @Min(value = 6)
    @Column(name = "password")
    var password: String,
    @CreatedDate
    @Column(name = "created")
    val created: LocalDateTime
){
    fun updateNickname(name : String){
        this.nickname = name
    }
}