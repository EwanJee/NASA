package com.project.nasa.setting.adapter.in.web.apod;

@io.swagger.v3.oas.annotations.tags.Tag(name = "GPT Api \ucee8\ud2b8\ub864\ub7ec", description = "https://api.openai.com/v1/chat/completions \uc774\uc6a9")
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/v1/nasa"})
@org.springframework.web.bind.annotation.RestController()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/project/nasa/setting/adapter/in/web/apod/GptController;", "", "apodAdapter", "Lcom/project/nasa/setting/adapter/out/persistence/member/service/apod/ApodAdapter;", "gptUseCase", "Lcom/project/nasa/setting/application/port/in/usecase/apod/GptUseCase;", "(Lcom/project/nasa/setting/adapter/out/persistence/member/service/apod/ApodAdapter;Lcom/project/nasa/setting/application/port/in/usecase/apod/GptUseCase;)V", "updateTranslationInfo", "Lorg/springframework/http/ResponseEntity;", "Lorg/springframework/hateoas/EntityModel;", "", "id", "", "lang", "nasa"})
public class GptController {
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.adapter.out.persistence.member.service.apod.ApodAdapter apodAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.application.port.in.usecase.apod.GptUseCase gptUseCase = null;
    
    public GptController(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.adapter.out.persistence.member.service.apod.ApodAdapter apodAdapter, @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.in.usecase.apod.GptUseCase gptUseCase) {
        super();
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\ud574\ub2f9 \uc124\uba85\ubb38 \ubc88\uc5ed\ud558\uae30", description = "\ud574\ub2f9 id\uc5d0 \ud574\ub2f9\ud558\ub294 \uac1d\uccb4\uc758 \uc124\uba85\ubb38\uc744 \ubc88\uc5ed\ud55c\ub2e4")
    @org.springframework.context.annotation.Description(value = "\ud574\ub2f9 id\uc5d0 \ud574\ub2f9\ud558\ub294 \uac1d\uccb4\uc758 \uc124\uba85\ubb38\uc744 \ubc88\uc5ed\ud55c\ub2e4")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/apod/tr/{id}"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.springframework.hateoas.EntityModel<java.lang.String>> updateTranslationInfo(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    long id, @org.springframework.web.bind.annotation.RequestParam(value = "lang")
    @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
}