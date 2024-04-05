package com.project.nasa.setting.adapter.out.mail

interface EmailService {
    fun sendImage(to: String, subject: String, url: String)
}