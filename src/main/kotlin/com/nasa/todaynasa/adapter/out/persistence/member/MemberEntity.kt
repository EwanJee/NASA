@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.member

import com.nasa.todaynasa.adapter.out.persistence.common.BaseEntity
import jakarta.persistence.*

@Table(name = "member")
@Entity
class MemberEntity : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null

    @Column(name = "email")
    var email: String = ""
        private set

    @Column(name = "password")
    var password: String = ""
        private set

    @Column(name = "nickname")
    var nickname: String = ""
        private set

    fun updateNickname(name: String) {
        this.nickname = name
    }
}
