package com.example.socialnetwork.common.mapper;

import com.example.socialnetwork.application.request.PostReactionRequest;
import com.example.socialnetwork.application.response.PostReactionResponse;
import com.example.socialnetwork.domain.model.PostReactionDomain;
import com.example.socialnetwork.domain.model.UserDomain;
import com.example.socialnetwork.infrastructure.entity.Post;
import com.example.socialnetwork.infrastructure.entity.PostReaction;
import com.example.socialnetwork.infrastructure.entity.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T21:37:09+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
public class PostReactionMapperImpl implements PostReactionMapper {

    @Override
    public PostReactionDomain requestToDomain(PostReactionRequest postReactionRequest) {
        if ( postReactionRequest == null ) {
            return null;
        }

        PostReactionDomain postReactionDomain = new PostReactionDomain();

        postReactionDomain.setPostId( postReactionRequest.getPostId() );
        postReactionDomain.setReactionType( postReactionRequest.getReactionType() );

        postReactionDomain.setUserId( getUserId() );
        postReactionDomain.setCreatedAt( getCreateAt() );

        return postReactionDomain;
    }

    @Override
    public PostReaction domainToEntity(PostReactionDomain postReactionDomain) {
        if ( postReactionDomain == null ) {
            return null;
        }

        PostReaction postReaction = new PostReaction();

        postReaction.setUser( postReactionDomainToUser( postReactionDomain ) );
        postReaction.setPost( postReactionDomainToPost( postReactionDomain ) );
        postReaction.setId( postReactionDomain.getId() );
        postReaction.setReactionType( postReactionDomain.getReactionType() );
        postReaction.setCreatedAt( postReactionDomain.getCreatedAt() );

        return postReaction;
    }

    @Override
    public PostReactionDomain entityToDomain(PostReaction postReaction) {
        if ( postReaction == null ) {
            return null;
        }

        PostReactionDomain postReactionDomain = new PostReactionDomain();

        postReactionDomain.setPostId( postReactionPostId( postReaction ) );
        postReactionDomain.setUserId( postReactionUserId( postReaction ) );
        postReactionDomain.setId( postReaction.getId() );
        postReactionDomain.setReactionType( postReaction.getReactionType() );
        postReactionDomain.setCreatedAt( postReaction.getCreatedAt() );

        return postReactionDomain;
    }

    @Override
    public PostReactionResponse domainToResponse(PostReactionDomain postReactionDomain) {
        if ( postReactionDomain == null ) {
            return null;
        }

        PostReactionResponse postReactionResponse = new PostReactionResponse();

        postReactionResponse.setId( postReactionDomain.getId() );
        postReactionResponse.setUserId( postReactionDomain.getUserId() );
        postReactionResponse.setPostId( postReactionDomain.getPostId() );
        postReactionResponse.setReactionType( postReactionDomain.getReactionType() );
        postReactionResponse.setCreatedAt( postReactionDomain.getCreatedAt() );

        return postReactionResponse;
    }

    @Override
    public PostReactionResponse domainToResponseWithUser(PostReactionDomain postReactionDomain, UserDomain userDomain) {
        if ( postReactionDomain == null && userDomain == null ) {
            return null;
        }

        PostReactionResponse postReactionResponse = new PostReactionResponse();

        if ( postReactionDomain != null ) {
            postReactionResponse.setId( postReactionDomain.getId() );
            postReactionResponse.setUserId( postReactionDomain.getUserId() );
            postReactionResponse.setPostId( postReactionDomain.getPostId() );
            postReactionResponse.setReactionType( postReactionDomain.getReactionType() );
            postReactionResponse.setCreatedAt( postReactionDomain.getCreatedAt() );
        }
        if ( userDomain != null ) {
            postReactionResponse.setUsername( userDomain.getUsername() );
            postReactionResponse.setAvatar( userDomain.getAvatar() );
        }

        return postReactionResponse;
    }

    protected User postReactionDomainToUser(PostReactionDomain postReactionDomain) {
        if ( postReactionDomain == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( postReactionDomain.getUserId() );

        return user.build();
    }

    protected Post postReactionDomainToPost(PostReactionDomain postReactionDomain) {
        if ( postReactionDomain == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.id( postReactionDomain.getPostId() );

        return post.build();
    }

    private Long postReactionPostId(PostReaction postReaction) {
        if ( postReaction == null ) {
            return null;
        }
        Post post = postReaction.getPost();
        if ( post == null ) {
            return null;
        }
        Long id = post.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long postReactionUserId(PostReaction postReaction) {
        if ( postReaction == null ) {
            return null;
        }
        User user = postReaction.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
