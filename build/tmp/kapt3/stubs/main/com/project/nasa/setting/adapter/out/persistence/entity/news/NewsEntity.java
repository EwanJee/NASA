package com.project.nasa.setting.adapter.out.persistence.entity.news;

@jakarta.persistence.Table(name = "news")
@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/entity/news/NewsEntity;", "", "id", "", "topic", "", "date", "Ljava/time/LocalDate;", "totalResults", "", "articles", "", "Lcom/project/nasa/setting/adapter/out/persistence/entity/news/ArticleEntity;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/time/LocalDate;ILjava/util/List;)V", "getArticles", "()Ljava/util/List;", "getDate", "()Ljava/time/LocalDate;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTopic", "()Ljava/lang/String;", "getTotalResults", "()I", "nasa"})
public final class NewsEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Column(name = "news_id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @jakarta.persistence.Column(name = "topic")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topic = null;
    @jakarta.persistence.Column(name = "date")
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate date = null;
    @jakarta.persistence.Column(name = "total_results")
    private final int totalResults = 0;
    @jakarta.persistence.OneToMany(mappedBy = "news", cascade = {jakarta.persistence.CascadeType.ALL})
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity> articles = null;
    
    public NewsEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, int totalResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity> articles) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.project.nasa.setting.adapter.out.persistence.entity.news.ArticleEntity> getArticles() {
        return null;
    }
}