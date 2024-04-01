package com.project.nasa.setting.adapter.in.web.news;

@io.swagger.v3.oas.annotations.tags.Tag(name = "News Api \ucee8\ud2b8\ub864\ub7ec", description = "https://newsapi.org/v2/everything \uc5d0\uc11c \ub370\uc774\ud130 \ubc1b\uae30 \ucee8\ud2b8\ub864\ub7ec")
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/news"})
@org.springframework.web.bind.annotation.RestController()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/project/nasa/setting/adapter/in/web/news/NewsController;", "", "newsPort", "Lcom/project/nasa/setting/application/port/out/usecase/NewsPort;", "newsAndArticleAdapter", "Lcom/project/nasa/setting/adapter/out/persistence/service/news/NewsAndArticleAdapter;", "(Lcom/project/nasa/setting/application/port/out/usecase/NewsPort;Lcom/project/nasa/setting/adapter/out/persistence/service/news/NewsAndArticleAdapter;)V", "getAndJoinApi", "Lorg/springframework/http/ResponseEntity;", "Lorg/springframework/hateoas/EntityModel;", "Lcom/project/nasa/setting/adapter/out/persistence/service/news/dto/ResponseNews;", "q", "", "date", "Ljava/time/LocalDate;", "getAndJoinApiByLang", "lang", "nasa"})
public class NewsController {
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.application.port.out.usecase.NewsPort newsPort = null;
    @org.jetbrains.annotations.NotNull()
    private final com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter newsAndArticleAdapter = null;
    
    public NewsController(@org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.application.port.out.usecase.NewsPort newsPort, @org.jetbrains.annotations.NotNull()
    com.project.nasa.setting.adapter.out.persistence.service.news.NewsAndArticleAdapter newsAndArticleAdapter) {
        super();
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\ub274\uc2a4 \ubd88\ub7ec\uc624\uae30", description = "q = \ud1a0\ud53d, date = \ub0a0\uc9dc \uc5d0 \ub9de\ub294 \ub274\uc2a4 \ubd88\ub7ec\uc624\uae30")
    @org.springframework.context.annotation.Description(value = "\ub274\uc2a4 \ubd88\ub7ec\uc624\uae30")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.springframework.hateoas.EntityModel<com.project.nasa.setting.adapter.out.persistence.service.news.dto.ResponseNews>> getAndJoinApi(@org.springframework.web.bind.annotation.RequestParam(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.springframework.web.bind.annotation.RequestParam(value = "date")
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
    @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "\ub274\uc2a4 \ubd88\ub7ec\uc624\uae30 (\uc5b8\uc5b4\uc5d0 \ub530\ub77c)", description = "q = \ud1a0\ud53d, date = \ub0a0\uc9dc, lang = \uc5b8\uc5b4 \uc5d0 \ub9de\ub294 \ub274\uc2a4 \ubd88\ub7ec\uc624\uae30")
    @org.springframework.context.annotation.Description(value = "\ub274\uc2a4 \ubd88\ub7ec\uc624\uae30 (\uc5b8\uc5b4\uc5d0 \ub530\ub77c)")
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{lang}"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.springframework.hateoas.EntityModel<com.project.nasa.setting.adapter.out.persistence.service.news.dto.ResponseNews>> getAndJoinApiByLang(@org.springframework.web.bind.annotation.RequestParam(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.springframework.web.bind.annotation.RequestParam(value = "date")
    @org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
    @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
}