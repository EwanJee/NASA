//package com.project.nasa.common.config.mail
//
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.mail.javamail.JavaMailSender
//import org.springframework.mail.javamail.JavaMailSenderImpl
//import java.util.Properties
//
//@Configuration
//class MailSender {
//    @Value("\${spring.mail.host}")
//    private lateinit var host: String
//
//    @Value("\${spring.mail.port}")
//    private lateinit var port: String
//
//    @Value("\${spring.mail.username}")
//    private lateinit var username: String
//
//    @Value("\${spring.mail.password}")
//    private lateinit var password: String
//    @Bean
//    fun mailSender(): JavaMailSender {
//        val mail = JavaMailSenderImpl()
//        mail.host = host
//        mail.port = port.toInt()
//        mail.username = username
//        mail.password = password
//        mail.defaultEncoding = "UTF-8"
//
//        val props: Properties = mail.javaMailProperties
//        props["mail.transport.protocol"] = "smtp"
//        props["mail.smtp.auth"] = "true"
//        props["mail.smtp.starttls.enable"] = "true"
//        props["mail.debug"] = "true"
//        return mail
//    }
//}