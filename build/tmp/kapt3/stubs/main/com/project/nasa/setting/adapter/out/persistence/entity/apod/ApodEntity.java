package com.project.nasa.setting.adapter.out.persistence.entity.apod;

@jakarta.persistence.Table(name = "APOD")
@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/entity/apod/ApodEntity;", "", "id", "", "date", "Ljava/time/LocalDate;", "explanation", "", "media_type", "title", "url", "hdurl", "translatedExplanation", "starPoint", "(Ljava/lang/Long;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDate", "()Ljava/time/LocalDate;", "getExplanation", "()Ljava/lang/String;", "getHdurl", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMedia_type", "getStarPoint", "()J", "setStarPoint", "(J)V", "getTitle", "getTranslatedExplanation", "setTranslatedExplanation", "(Ljava/lang/String;)V", "getUrl", "addOneToStarPoint", "updateTranslation", "", "nasa"})
@lombok.NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public final class ApodEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Column(name = "id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @jakarta.persistence.Column(name = "date")
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDate date = null;
    @jakarta.persistence.Column(name = "explanation", length = 2000)
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String explanation = null;
    @jakarta.persistence.Column(name = "media_type")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String media_type = null;
    @jakarta.persistence.Column(name = "title")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @jakarta.persistence.Column(name = "url")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @jakarta.persistence.Column(name = "hdurl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hdurl = null;
    @jakarta.persistence.Column(name = "translated_explanation", length = 2000)
    @org.jetbrains.annotations.Nullable()
    private java.lang.String translatedExplanation;
    @jakarta.persistence.Column(name = "star_point")
    private long starPoint;
    
    public ApodEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
    @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    java.lang.String explanation, @org.jetbrains.annotations.NotNull()
    java.lang.String media_type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String hdurl, @jakarta.annotation.Nullable()
    @org.jetbrains.annotations.Nullable()
    java.lang.String translatedExplanation, long starPoint) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExplanation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMedia_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHdurl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTranslatedExplanation() {
        return null;
    }
    
    public final void setTranslatedExplanation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getStarPoint() {
        return 0L;
    }
    
    public final void setStarPoint(long p0) {
    }
    
    public final void updateTranslation(@org.jetbrains.annotations.NotNull()
    java.lang.String explanation) {
    }
    
    public final long addOneToStarPoint() {
        return 0L;
    }
}