package com.project.nasa.setting.application.port.in.service.apod;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/project/nasa/setting/application/port/in/service/apod/GptApiService;", "Lcom/project/nasa/setting/application/port/in/usecase/apod/GptUseCase;", "gptClient", "Lorg/springframework/web/reactive/function/client/WebClient;", "(Lorg/springframework/web/reactive/function/client/WebClient;)V", "translateByLanguage", "", "lang", "content", "nasa"})
public class GptApiService implements com.project.nasa.setting.application.port.in.usecase.apod.GptUseCase {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.web.reactive.function.client.WebClient gptClient = null;
    
    public GptApiService(@org.jetbrains.annotations.NotNull()
    org.springframework.web.reactive.function.client.WebClient gptClient) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String translateByLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        return null;
    }
}