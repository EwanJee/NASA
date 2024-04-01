package com.project.nasa.setting.adapter.out.persistence.entity.news;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArticleEntity is a Querydsl query type for ArticleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArticleEntity extends EntityPathBase<ArticleEntity> {

    private static final long serialVersionUID = 1473305938L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArticleEntity articleEntity = new QArticleEntity("articleEntity");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final QNewsEntity news;

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public QArticleEntity(String variable) {
        this(ArticleEntity.class, forVariable(variable), INITS);
    }

    public QArticleEntity(Path<ArticleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArticleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArticleEntity(PathMetadata metadata, PathInits inits) {
        this(ArticleEntity.class, metadata, inits);
    }

    public QArticleEntity(Class<? extends ArticleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.news = inits.isInitialized("news") ? new QNewsEntity(forProperty("news")) : null;
    }

}

