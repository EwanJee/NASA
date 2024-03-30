package com.project.nasa.setting.adapter.in.web.apod;

@io.swagger.v3.oas.annotations.tags.Tag(name = "NASA Api \ucee8\ud2b8\ub864\ub7ec", description = "https://api.nasa.gov \uc5d0\uc11c \ub370\uc774\ud130 \ubc1b\uae30 \ucee8\ud2b8\ub864\ub7ec")
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/v1/nasa"})
@org.springframework.web.bind.annotation.RestController()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/project/nasa/setting/adapter/in/web/apod/NasaApiController;", "", "apiUseCase", "Lcom/project/nasa/setting/application/port/in/usecase/apod/NasaApiUseCase;", "apodAdapter", "Lcom/project/nasa/setting/adapter/out/persistence/member/service/apod/ApodAdapter;", "(Lcom/project/nasa/setting/application/port/in/usecase/apod/NasaApiUseCase;Lcom/project/nasa/setting/adapter/out/persistence/member/service/apod/ApodAdapter;)V", "getAndJoinApi", "Lorg/springframework/http/ResponseEntity;", "Lorg/springframework/hateoas/EntityModel;", "Lcom/project/nasa/setting/application/port/in/dto/response/apod/ResponseApod;", "date", "Ljava/time/LocalDate;", "updateStarPoint", "", "id", "nasa"})
public class NasaApiController {
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.application.port.in.usecase.apod.NasaApiUseCase apiUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.adapter.out.persistence.member.service.apod.ApodAdapter apodAdapter = null;
    
    public NasaApiController(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.in.usecase.apod.NasaApiUseCase apiUseCase, @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.adapter.out.persistence.member.service.apod.ApodAdapter apodAdapter) {
        super();
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "APOD \ubc1b\uae30", description = "APOD = Astronomy Picture of the Day")
    @org.springframework.context.annotation.Description(value = "API\ub85c\ubd80\ud130 APOD\ub97c \ubc1b\uace0 DB\uc5d0 \uc800\uc7a5\ud55c\ub2e4")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/apod"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.springframework.hateoas.EntityModel<com.project.nasa.setting.application.port.in.dto.response.apod.ResponseApod>> getAndJoinApi(@org.springframework.web.bind.annotation.RequestParam(value = "date")
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
    @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "APOD \ubcc4\uc810 \uc62c\ub9ac\uae30", description = "APOD \ubcc4\uc810 \uc62c\ub9ac\uae30")
    @org.springframework.context.annotation.Description(value = "\ud574\ub2f9 APOD\uc758 StarPoint\ub97c 1 \uc62c\ub824\uc900\ub2e4")
    @org.springframework.web.bind.annotation.PutMapping(value = {"/apod"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.springframework.hateoas.EntityModel<java.lang.Long>> updateStarPoint(@org.springframework.web.bind.annotation.RequestParam(value = "date")
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
    @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.springframework.web.bind.annotation.RequestParam(value = "id")
    long id) {
        return null;
    }
}