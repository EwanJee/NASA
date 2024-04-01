package com.project.nasa.setting.adapter.out.persistence.service.apod;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH&\u00a8\u0006\u0010"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/service/apod/ApodAdapter;", "", "addOnetoStarPoint", "", "id", "getByDate", "Lcom/project/nasa/setting/adapter/out/persistence/service/dto/response/ResponseApod;", "date", "Ljava/time/LocalDate;", "getExplanationById", "", "join", "apodData", "Lcom/project/nasa/setting/application/port/out/response/apod/ApodData;", "updateTranslation", "translated", "nasa"})
public abstract interface ApodAdapter {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod getByDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.project.nasa.setting.adapter.out.persistence.service.dto.response.ResponseApod join(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.out.response.apod.ApodData apodData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getExplanationById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String updateTranslation(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String translated);
    
    public abstract long addOnetoStarPoint(long id);
}