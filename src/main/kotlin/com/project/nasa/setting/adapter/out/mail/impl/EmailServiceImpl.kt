package com.project.nasa.setting.adapter.out.mail.impl

import com.project.nasa.setting.adapter.out.mail.EmailService
import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail
import org.springframework.core.io.InputStreamSource
import org.springframework.core.io.UrlResource
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Component

@Component
class EmailServiceImpl(
    private val mailSender: JavaMailSender
) : EmailService {
    override fun sendImage(to: String, subject: String, url: String) : ResponseEmail {
        val message = mailSender.createMimeMessage()
        try {
            val helper = MimeMessageHelper(message, true, "UTF-8")
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText(url, true)

            val imageResource: InputStreamSource = UrlResource(url)
            helper.addAttachment("APOD.jpg", imageResource)
            mailSender.send(message)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ResponseEmail(url, to)
    }
}