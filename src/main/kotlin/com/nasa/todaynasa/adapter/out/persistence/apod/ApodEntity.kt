@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.nasa.todaynasa.adapter.out.persistence.apod

import com.nasa.todaynasa.domain.Apod
import jakarta.annotation.Nullable
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

    @Nullable
    @Column(length = 2000)
    var translatedExplanation: String? = null

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
    }
}
