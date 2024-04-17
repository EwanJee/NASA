package com.project.nasa.setting.adapter.out.mail.impl

import com.project.nasa.common.exception.ErrorCode
import com.project.nasa.common.exception.email.EmailException
import com.project.nasa.setting.adapter.out.mail.EmailService
import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail
import org.springframework.core.io.InputStreamSource
import org.springframework.core.io.UrlResource
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Component
import java.security.SecureRandom

@Component
class EmailServiceImpl(
    private val mailSender: JavaMailSender
) : EmailService {
    override fun sendImage(to: String, subject: String, url: String): ResponseEmail {
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
            throw EmailException(ErrorCode.EMAIL_SEND_FAILED)
        }
        return ResponseEmail(url, to)
    }

    fun sendValidationMail(to: String, subject: String): ResponseEmail {
        val message = mailSender.createMimeMessage()
        try {
            val helper = MimeMessageHelper(message, true, "UTF-8")
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText("", true)

            mailSender.send(message)
        } catch (e: Exception) {
            e.printStackTrace()
            throw EmailException(ErrorCode.EMAIL_SEND_FAILED)
        }
        return ResponseEmail(subject, to)
    }

    private fun createCode(): String {
        val random: SecureRandom = SecureRandom.getInstanceStrong()
        val sb: StringBuilder = StringBuilder()
        for (i in 0..6) {
            sb.append(random.nextInt(10))
        }
        return sb.toString()
    }
}