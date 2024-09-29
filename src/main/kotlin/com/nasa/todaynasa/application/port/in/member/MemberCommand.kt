@file:Suppress("ktlint:standard:package-name")

package com.nasa.todaynasa.application.port.`in`.member

import com.nasa.todaynasa.application.port.`in`.member.dto.CreateMemberRequest

interface MemberCommand {
    fun createMember(createMemberRequest: CreateMemberRequest)
}
