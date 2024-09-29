package com.nasa.todaynasa.domain

import java.time.LocalDate

class Apod(
    val date: LocalDate,
    val explanationEN: String,
    val mediaType: String,
    val title: String,
    val url: String,
    val hdurl: String,
    var explanationKR: String,
)
