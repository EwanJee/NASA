package com.project.nasa.setting.adapter.out.persistence.member.repository

import com.project.nasa.setting.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long> {
}