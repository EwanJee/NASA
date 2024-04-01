package com.project.nasa.common.config.webclient;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\tH\u0017J\b\u0010\u000b\u001a\u00020\tH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/project/nasa/common/config/webclient/WebClientConfig;", "", "()V", "key", "", "newsKey", "newsUrl", "url", "gptClient", "Lorg/springframework/web/reactive/function/client/WebClient;", "nasaClient", "newsClient", "nasa"})
public class WebClientConfig {
    @org.springframework.beans.factory.annotation.Value(value = "${chatGpt.url}")
    private java.lang.String url;
    @org.springframework.beans.factory.annotation.Value(value = "${chatGpt.key}")
    private java.lang.String key;
    @org.springframework.beans.factory.annotation.Value(value = "${news.url}")
    private java.lang.String newsUrl;
    @org.springframework.beans.factory.annotation.Value(value = "${news.key}")
    private java.lang.String newsKey;
    
    public WebClientConfig() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.reactive.function.client.WebClient nasaClient() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.reactive.function.client.WebClient gptClient() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.reactive.function.client.WebClient newsClient() {
        return null;
    }
}