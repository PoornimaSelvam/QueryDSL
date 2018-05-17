package com.querydsl.intro.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBlogPost is a Querydsl query type for BlogPost
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBlogPost extends EntityPathBase<BlogPost> {

    private static final long serialVersionUID = -2057271327L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBlogPost blogPost = new QBlogPost("blogPost");

    public final StringPath body = createString("body");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public final QUser user;

    public QBlogPost(String variable) {
        this(BlogPost.class, forVariable(variable), INITS);
    }

    public QBlogPost(Path<? extends BlogPost> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBlogPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBlogPost(PathMetadata metadata, PathInits inits) {
        this(BlogPost.class, metadata, inits);
    }

    public QBlogPost(Class<? extends BlogPost> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

