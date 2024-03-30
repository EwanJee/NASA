package com.project.nasa.setting.application.port.in.usecase.apod;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/project/nasa/setting/application/port/in/usecase/apod/NasaApiUseCase;", "", "getApod", "Lcom/project/nasa/setting/application/port/in/dto/response/apod/ResponseApod;", "url", "", "date", "Ljava/time/LocalDate;", "nasa"})
public abstract interface NasaApiUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod getApod(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
}