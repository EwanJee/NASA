package com.project.nasa.setting.adapter.out.persistence.service.apod.impl;

@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0017J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/service/apod/impl/ApodAdapterImpl;", "Lcom/project/nasa/setting/adapter/out/persistence/service/apod/ApodAdapter;", "apodEntityRepository", "Lcom/project/nasa/setting/adapter/out/persistence/repository/apod/ApodEntityRepository;", "(Lcom/project/nasa/setting/adapter/out/persistence/repository/apod/ApodEntityRepository;)V", "addOnetoStarPoint", "", "id", "getByDate", "Lcom/project/nasa/setting/application/port/in/dto/response/apod/ResponseApod;", "date", "Ljava/time/LocalDate;", "getExplanationById", "", "join", "responseApod", "updateTranslation", "translated", "nasa"})
public class ApodAdapterImpl implements com.project.nasa.setting.adapter.out.persistence.service.apod.ApodAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.adapter.out.persistence.repository.apod.ApodEntityRepository apodEntityRepository = null;
    
    public ApodAdapterImpl(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.adapter.out.persistence.repository.apod.ApodEntityRepository apodEntityRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod getByDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod join(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod responseApod) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getExplanationById(long id) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String updateTranslation(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String translated) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public long addOnetoStarPoint(long id) {
        return 0L;
    }
}