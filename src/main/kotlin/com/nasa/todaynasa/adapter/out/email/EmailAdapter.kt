package com.nasa.todaynasa.adapter.out.email

import com.nasa.todaynasa.application.port.out.email.EmailQuery
import com.nasa.todaynasa.domain.exception.BusinessException
import com.nasa.todaynasa.domain.exception.ErrorCode
import com.nasa.todaynasa.infrastructure.annotations.Adapter
import org.springframework.core.io.InputStreamSource
import org.springframework.core.io.UrlResource
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper

@Adapter
class EmailAdapter(
    private val mailSender: JavaMailSender,
) : EmailQuery {
    override fun sendImage(
        to: String,
        subject: String,
        url: String,
    ) {
        val message = mailSender.createMimeMessage()
        try {
            val helper = MimeMessageHelper(message, true, Charsets.UTF_8.name())
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText(url, true)

            val imageResource: InputStreamSource = UrlResource(url)
            helper.addAttachment("APOD.jpg", imageResource)
            mailSender.send(message)
        } catch (e: Exception) {
            throw BusinessException(ErrorCode.EMAIL_SEND_FAILED, e)
        }
    }
}
