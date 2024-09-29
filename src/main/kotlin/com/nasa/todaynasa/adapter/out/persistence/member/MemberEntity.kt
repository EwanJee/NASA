@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.member

import jakarta.persistence.*

@Table(name = "member")
@Entity
class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
}
