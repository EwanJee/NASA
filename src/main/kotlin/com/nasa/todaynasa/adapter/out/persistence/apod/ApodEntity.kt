@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.domain.Apod
import jakarta.persistence.*
import java.time.LocalDate

@Table(name = "apod")
@Entity
class ApodEntity(
    date: LocalDate,
    explanation: String,
    mediaType: String,
    title: String,
    url: String,
    hdurl: String,
    translatedExplanation: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
        private set
    var date: LocalDate = date
        private set
    var explanation: String = explanation
        private set
    var mediaType: String = mediaType
        private set
    var title: String = title
        private set
    var url: String = url
        private set
    var hdurl: String = hdurl
        private set

    @Column(length = 2000)
    var translatedExplanation: String = translatedExplanation
        private set

    companion object {
        fun from(apodEntity: ApodEntity): Apod =
            Apod(
                date = apodEntity.date,
                explanation = apodEntity.explanation,
                mediaType = apodEntity.mediaType,
                title = apodEntity.title,
                url = apodEntity.url,
                hdurl = apodEntity.hdurl,
                translatedExplanation = apodEntity.translatedExplanation,
            )

        fun from(apod: Apod): ApodEntity =
            ApodEntity(
                date = apod.date,
                explanation = apod.explanation,
                mediaType = apod.mediaType,
                title = apod.title,
                url = apod.url,
                hdurl = apod.hdurl,
                translatedExplanation = apod.translatedExplanation,
            )
    }
}
