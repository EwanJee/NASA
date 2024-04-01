package com.project.nasa.setting.adapter.out.persistence.service.news.impl;

@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/service/news/impl/NewsAndArticleAdapterImpl;", "Lcom/project/nasa/setting/adapter/out/persistence/service/news/NewsAndArticleAdapter;", "newsEntityRepository", "Lcom/project/nasa/setting/adapter/out/persistence/repository/news/NewsEntityRepository;", "(Lcom/project/nasa/setting/adapter/out/persistence/repository/news/NewsEntityRepository;)V", "getByQAndDate", "Lcom/project/nasa/setting/adapter/out/persistence/service/news/dto/response/ResponseNews;", "topic", "", "date", "Ljava/time/LocalDate;", "join", "newsData", "Lcom/project/nasa/setting/application/port/out/response/news/NewsData;", "nasa"})
public class NewsAndArticleAdapterImpl implements com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.adapter.out.persistence.repository.news.NewsEntityRepository newsEntityRepository = null;
    
    public NewsAndArticleAdapterImpl(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.adapter.out.persistence.repository.news.NewsEntityRepository newsEntityRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews getByQAndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.project.nasa.setting.adapter.out.persistence.service.news.dto.response.ResponseNews join(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.out.response.news.NewsData newsData) {
        return null;
    }
}