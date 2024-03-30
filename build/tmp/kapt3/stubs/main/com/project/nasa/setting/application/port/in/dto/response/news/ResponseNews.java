package com.project.nasa.setting.application.port.in.dto.response.news;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/project/nasa/setting/application/port/in/dto/response/news/ResponseNews;", "", "id", "", "totalResults", "", "topic", "", "date", "Ljava/time/LocalDate;", "articles", "", "Lcom/project/nasa/setting/application/port/in/dto/response/news/ResponseArticle;", "(Ljava/lang/Long;ILjava/lang/String;Ljava/time/LocalDate;Ljava/util/List;)V", "getArticles", "()Ljava/util/List;", "setArticles", "(Ljava/util/List;)V", "getDate", "()Ljava/time/LocalDate;", "setDate", "(Ljava/time/LocalDate;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "getTotalResults", "()I", "setTotalResults", "(I)V", "nasa"})
public final class ResponseNews {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    private int totalResults;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String topic;
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDate date;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> articles;
    
    public ResponseNews(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, int totalResults, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> articles) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    public final void setTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.application.port.in.dto.response.news.ResponseArticle> p0) {
    }
}