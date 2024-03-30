package com.project.nasa.setting.application.port.in.dto.request.news;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0006\u0010\u0019\u001a\u00020\u001aR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/project/nasa/setting/application/port/in/dto/request/news/RequestNews;", "", "totalResults", "", "articles", "", "Lcom/project/nasa/setting/application/port/in/dto/response/news/ResponseArticle;", "(ILjava/util/List;)V", "getArticles", "()Ljava/util/List;", "setArticles", "(Ljava/util/List;)V", "getTotalResults", "()I", "setTotalResults", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "trimArticles", "", "nasa"})
public final class RequestNews {
    private int totalResults;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> articles;
    
    public RequestNews(@com.fasterxml.jackson.annotation.JsonProperty(value = "totalResults")
    int totalResults, @jakarta.validation.constraints.Size(max = 8)
    @com.fasterxml.jackson.annotation.JsonProperty(value = "articles")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> articles) {
        super();
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> p0) {
    }
    
    public final void trimArticles() {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.project.nasa.setting.application.port.in.dto.request.news.RequestNews copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "totalResults")
    int totalResults, @jakarta.validation.constraints.Size(max = 8)
    @com.fasterxml.jackson.annotation.JsonProperty(value = "articles")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> articles) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}