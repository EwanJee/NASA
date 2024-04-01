package com.project.nasa.setting.application.port.in.usecase.news;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/project/nasa/setting/application/port/in/usecase/news/NewsUseCase;", "", "getAndPutApi", "Lcom/project/nasa/setting/domain/news/News;", "q", "", "date", "Ljava/time/LocalDate;", "lang", "nasa"})
public abstract interface NewsUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.project.nasa.setting.domain.news.News getAndPutApi(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.lang.String lang);
}