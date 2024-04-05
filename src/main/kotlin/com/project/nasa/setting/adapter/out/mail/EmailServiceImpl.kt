package com.project.nasa.setting.adapter.out.mail

import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper

class EmailServiceImpl(
    private val mailSender: JavaMailSender
) {
    fun sendMail(to: String, subject: String, body: String) {
        val message = mailSender.createMimeMessage()
        try {
            val helper = MimeMessageHelper(message, true, "UTF-8")
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText(body, true)
            mailSender.send(message)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}