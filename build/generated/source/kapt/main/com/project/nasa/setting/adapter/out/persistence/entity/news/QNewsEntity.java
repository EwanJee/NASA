package com.project.nasa.setting.adapter.out.persistence.entity.news;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNewsEntity is a Querydsl query type for NewsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNewsEntity extends EntityPathBase<NewsEntity> {

    private static final long serialVersionUID = -1461143971L;

    public static final QNewsEntity newsEntity = new QNewsEntity("newsEntity");

    public final ListPath<ArticleEntity, QArticleEntity> articles = this.<ArticleEntity, QArticleEntity>createList("articles", ArticleEntity.class, QArticleEntity.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath topic = createString("topic");

    public final NumberPath<Integer> totalResults = createNumber("totalResults", Integer.class);

    public QNewsEntity(String variable) {
        super(NewsEntity.class, forVariable(variable));
    }

    public QNewsEntity(Path<NewsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNewsEntity(PathMetadata metadata) {
        super(NewsEntity.class, metadata);
    }

}

