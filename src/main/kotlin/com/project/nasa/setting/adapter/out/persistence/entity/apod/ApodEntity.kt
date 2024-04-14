package com.project.nasa.setting.adapter.out.persistence.entity.apod

import jakarta.annotation.Nullable
import jakarta.persistence.*
import lombok.AccessLevel
import lombok.NoArgsConstructor
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "apod")
@Entity
class ApodEntity(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Long? = null,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "date")
    val date: LocalDate,
    @Column(name = "explanation", length = 2000)
    val explanation: String,
    @Column(name = "media_type")
    val media_type: String,
    @Column(name = "title")
    val title: String,
    @Column(name = "url")
    val url: String,
    @Column(name = "hdurl")
    val hdurl: String,
    @Nullable
    @Column(name = "translated_explanation", length = 2000)
    var translatedExplanation: String? = null
) {
    fun updateTranslation(explanation: String) {
        this.translatedExplanation = explanation
    }
}