package com.project.nasa.setting.application.port.in.service.apod;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/project/nasa/setting/application/port/in/service/apod/NasaApiService;", "Lcom/project/nasa/setting/application/port/in/usecase/apod/NasaApiUseCase;", "nasaClient", "Lorg/springframework/web/reactive/function/client/WebClient;", "(Lorg/springframework/web/reactive/function/client/WebClient;)V", "key", "", "getKey", "()Ljava/lang/String;", "key$delegate", "Lkotlin/Lazy;", "value", "getApiURL", "url", "date", "Ljava/time/LocalDate;", "getApod", "Lcom/project/nasa/setting/application/port/in/dto/response/apod/ResponseApod;", "nasa"})
public class NasaApiService implements com.project.nasa.setting.application.port.in.usecase.apod.NasaApiUseCase {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.web.reactive.function.client.WebClient nasaClient = null;
    @org.springframework.beans.factory.annotation.Value(value = "${openApi.key}")
    private java.lang.String value;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy key$delegate = null;
    
    public NasaApiService(@org.jetbrains.annotations.NotNull()
    org.springframework.web.reactive.function.client.WebClient nasaClient) {
        super();
    }
    
    private final java.lang.String getKey() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod getApod(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    private java.lang.String getApiURL(java.lang.String url, java.time.LocalDate date) {
        return null;
    }
}