package com.project.nasa.setting.adapter.out.persistence.member.entity

import jakarta.persistence.*
import lombok.AccessLevel
import lombok.NoArgsConstructor
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "APODENTITY")
@Entity
class ApodEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long? = null,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    val date : LocalDate,
    @Column(length = 2000)
    val explanation : String,
    val media_type : String,
    val service_version : String,
    val title : String,
    val url : String
)