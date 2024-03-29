package com.project.nasa.setting.application.port.`in`.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Size

data class RequestNews(
    @JsonProperty("totalResults")
    var totalResults: Int,
    @Size(max = 8)
    @JsonProperty("articles")
    var articles: List<RequestArticle>
) {
    fun trimArticles(){
        if(articles.size > 8){
            this.articles = articles.take(8)
            this.totalResults = articles.size
        }
    }
}