package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.*
import lombok.AccessLevel
import lombok.NoArgsConstructor
import java.time.LocalDate

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "APODENTITY")
@Entity
class ApodEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long? = null,
    val date : LocalDate,
    val explanation : String,
    val media_type : String,
    val service_version : String,
    val title : String,
    val url : String
)