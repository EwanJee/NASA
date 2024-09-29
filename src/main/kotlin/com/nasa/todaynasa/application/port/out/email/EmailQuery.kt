package com.nasa.todaynasa.application.port.out.email

interface EmailQuery {
    fun sendImage(
        to: String,
        subject: String,
        url: String,
    )
}
