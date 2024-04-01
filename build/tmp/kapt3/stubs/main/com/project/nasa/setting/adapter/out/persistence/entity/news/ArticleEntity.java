package com.project.nasa.setting.adapter.out.persistence.entity.news;

@jakarta.persistence.Table(name = "article")
@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/entity/news/ArticleEntity;", "", "id", "", "title", "", "description", "url", "image", "news", "Lcom/project/nasa/setting/adapter/out/persistence/entity/news/NewsEntity;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/project/nasa/setting/adapter/out/persistence/entity/news/NewsEntity;)V", "getDescription", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImage", "getNews", "()Lcom/project/nasa/setting/adapter/out/persistence/entity/news/NewsEntity;", "getTitle", "getUrl", "nasa"})
public final class ArticleEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Column(name = "article_id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @jakarta.persistence.Column(name = "title")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @jakarta.persistence.Column(name = "description", length = 2000)
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @jakarta.persistence.Column(name = "url", length = 500)
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @jakarta.persistence.Column(name = "image", length = 500)
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String image = null;
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @jakarta.persistence.JoinColumn(name = "news_id")
    @org.jetbrains.annotations.Nullable()
    private final com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity news = null;
    
    public ArticleEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity news) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity getNews() {
        return null;
    }
}