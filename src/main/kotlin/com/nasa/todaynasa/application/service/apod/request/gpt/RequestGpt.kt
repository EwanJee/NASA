package com.nasa.todaynasa.application.service.apod.request.gpt

import com.fasterxml.jackson.annotation.JsonProperty

data class RequestGpt(
    @JsonProperty("model")
    val model: String,
    @JsonProperty("messages")
    val messages: MutableList<Message>,
) {
    fun addMessage(message: Message) {
        this.messages.add(message)
    }
}

/**
 * 예시 :
 * {
 *   "model": "gpt-3.5-turbo",
 *     "messages": [
 *       {
 *         "role": "system",
 *         "content": "You are an expert at translating English into Korean."
 *       },
 *       {
 *         "role": "user",
 *         "content": "Translate the following English-written paragraph into Korean : Hello my name is Ewan"
 *       }
 *     ]
 * }
 */
data class Message(
    @JsonProperty("role")
    val role: String,
    @JsonProperty("content")
    var content: String,
) {
    fun updateContent(paragraph: String?) {
        when (this.role) {
            "system" -> this.content = "You are an expert at translating English into ${this.content}"
            "user" ->
                this.content =
                    "Translate the following English-written paragraph into ${this.content} : $paragraph"
        }
    }
}
