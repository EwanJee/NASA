package com.project.nasa.adapter.out.mail.impl

import com.project.nasa.common.exception.ErrorCode
import com.project.nasa.common.exception.email.EmailException
import com.project.nasa.setting.adapter.out.mail.dto.response.ResponseEmail
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.SetOperations
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service

@Service
class EmailValidationServiceImpl(
    private val mailSender: JavaMailSender,
    private val likeOps: SetOperations<String, String>,
) {
    @Value("\${url}")
    private lateinit var url: String

    fun sendValidationMail(
        to: String,
        subject: String,
    ): ResponseEmail {
        val message = mailSender.createMimeMessage()
        try {
            val helper = MimeMessageHelper(message, true, "UTF-8")
            val token = createCode()
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText("아래 링크를 클릭하여 이메일 주소를 입력하세요 : <br> $url/verify?token=$token", true)
            mailSender.send(message)
        } catch (e: Exception) {
            e.printStackTrace()
            throw EmailException(ErrorCode.EMAIL_SEND_FAILED)
        }
        return ResponseEmail(subject, to)
    }

    private fun createCode(): String {
        return ""
    }
}
