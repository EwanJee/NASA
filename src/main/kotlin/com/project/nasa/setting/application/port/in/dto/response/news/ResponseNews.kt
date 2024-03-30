package com.project.nasa.setting.application.port.`in`.dto.response.news

import java.time.LocalDate

class ResponseNews(
    var id : Long?,
    var totalResults: Int,
    var topic : String,
    var date : LocalDate,
    var articles: List<ResponseArticle>
)