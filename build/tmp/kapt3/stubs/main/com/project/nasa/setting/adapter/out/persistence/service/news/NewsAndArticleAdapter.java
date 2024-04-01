package com.project.nasa.setting.adapter.out.persistence.service.news;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/service/news/NewsAndArticleAdapter;", "", "getByQAndDate", "Lcom/project/nasa/setting/adapter/out/persistence/service/news/dto/response/ResponseNews;", "topic", "", "date", "Ljava/time/LocalDate;", "join", "newsData", "Lcom/project/nasa/setting/application/port/out/response/news/NewsData;", "nasa"})
public abstract interface NewsAndArticleAdapter {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews getByQAndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews join(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.out.response.news.NewsData newsData);
}