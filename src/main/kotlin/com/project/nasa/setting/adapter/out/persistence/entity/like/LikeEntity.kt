package com.project.nasa.setting.adapter.out.persistence.entity.like

import com.project.nasa.setting.adapter.out.persistence.entity.MemberEntity
import com.project.nasa.setting.adapter.out.persistence.entity.apod.ApodEntity
import jakarta.persistence.*

@Table(
    name = "like", uniqueConstraints = [
        UniqueConstraint(name = "likes", columnNames = ["member_id", "apod_id"])
    ]
)
@Entity
/**
 * Member 와 APOD 간의 LIKE 관계
 */
class LikeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "member_id")
    val member: MemberEntity,
    @ManyToOne
    @JoinColumn(name = "apod_id")
    val apod: ApodEntity
)