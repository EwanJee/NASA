package com.project.nasa.setting.application.port.in.service.news;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/project/nasa/setting/application/port/in/service/news/NewsApiService;", "Lcom/project/nasa/setting/application/port/in/usecase/news/NewsUseCase;", "newsClient", "Lorg/springframework/web/reactive/function/client/WebClient;", "(Lorg/springframework/web/reactive/function/client/WebClient;)V", "getAndPutApi", "Lcom/project/nasa/setting/application/port/in/dto/request/news/RequestNews;", "q", "", "date", "Ljava/time/LocalDate;", "lang", "nasa"})
public class NewsApiService implements com.project.nasa.setting.application.port.in.usecase.news.NewsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.web.reactive.function.client.WebClient newsClient = null;
    
    public NewsApiService(@org.jetbrains.annotations.NotNull()
    org.springframework.web.reactive.function.client.WebClient newsClient) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.project.nasa.setting.application.port.in.dto.request.news.RequestNews getAndPutApi(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
}