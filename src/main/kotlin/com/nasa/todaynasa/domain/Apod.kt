package com.nasa.todaynasa.domain

import java.time.LocalDate

class Apod(
    val date: LocalDate,
    val explanation: String,
    val media_type: String,
    val title: String,
    val url: String,
    val hdurl: String,
    val translatedExplanation: String?,
)
