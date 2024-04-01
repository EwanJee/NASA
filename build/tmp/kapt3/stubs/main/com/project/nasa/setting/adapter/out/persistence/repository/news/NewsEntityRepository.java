package com.project.nasa.setting.adapter.out.persistence.repository.news;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/project/nasa/setting/adapter/out/persistence/repository/news/NewsEntityRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/project/nasa/setting/adapter/out/persistence/entity/news/NewsEntity;", "", "findByTopicAndDate", "topic", "", "date", "Ljava/time/LocalDate;", "nasa"})
public abstract interface NewsEntityRepository extends org.springframework.data.jpa.repository.JpaRepository<com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.project.nasa.setting.adapter.out.persistence.entity.news.NewsEntity findByTopicAndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
}