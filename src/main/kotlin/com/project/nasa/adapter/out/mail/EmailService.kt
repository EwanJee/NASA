package com.project.nasa.adapter.out.mail

import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail

interface EmailService {
    fun sendImage(
        to: String,
        subject: String,
        url: String,
    ): ResponseEmail
}
