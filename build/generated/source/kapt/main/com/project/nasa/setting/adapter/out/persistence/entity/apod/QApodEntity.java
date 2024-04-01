package com.project.nasa.setting.adapter.out.persistence.entity.apod;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QApodEntity is a Querydsl query type for ApodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApodEntity extends EntityPathBase<ApodEntity> {

    private static final long serialVersionUID = -2072363779L;

    public static final QApodEntity apodEntity = new QApodEntity("apodEntity");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final StringPath explanation = createString("explanation");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath media_type = createString("media_type");

    public final StringPath service_version = createString("service_version");

    public final NumberPath<Long> starPoint = createNumber("starPoint", Long.class);

    public final StringPath title = createString("title");

    public final StringPath translatedExplanation = createString("translatedExplanation");

    public final StringPath url = createString("url");

    public QApodEntity(String variable) {
        super(ApodEntity.class, forVariable(variable));
    }

    public QApodEntity(Path<ApodEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApodEntity(PathMetadata metadata) {
        super(ApodEntity.class, metadata);
    }

}

