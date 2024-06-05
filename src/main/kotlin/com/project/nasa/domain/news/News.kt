package com.project.nasa.domain.news

class News(
    var totalResults: Int,
    var articles: List<Article>,
) {
    fun trimArticles() {
        if (articles.size > 8) {
            this.articles = articles.take(8)
            this.totalResults = articles.size
        }
    }
}
