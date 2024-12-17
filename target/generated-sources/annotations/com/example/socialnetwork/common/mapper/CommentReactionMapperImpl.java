package com.example.socialnetwork.common.mapper;

import com.example.socialnetwork.application.request.CommentReactionRequest;
import com.example.socialnetwork.application.response.CommentReactionResponse;
import com.example.socialnetwork.common.constant.Visibility;
import com.example.socialnetwork.domain.model.CommentDomain;
import com.example.socialnetwork.domain.model.CommentReactionDomain;
import com.example.socialnetwork.domain.model.PostDomain;
import com.example.socialnetwork.domain.model.UserDomain;
import com.example.socialnetwork.infrastructure.entity.Comment;
import com.example.socialnetwork.infrastructure.entity.CommentReaction;
import com.example.socialnetwork.infrastructure.entity.Post;
import com.example.socialnetwork.infrastructure.entity.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T21:37:09+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
public class CommentReactionMapperImpl implements CommentReactionMapper {

    @Override
    public CommentReactionDomain requestToDomain(CommentReactionRequest commentReactionRequest) {
        if ( commentReactionRequest == null ) {
            return null;
        }

        CommentReactionDomain commentReactionDomain = new CommentReactionDomain();

        commentReactionDomain.setComment( commentReactionRequestToCommentDomain( commentReactionRequest ) );
        commentReactionDomain.setReactionType( commentReactionRequest.getReactionType() );
        commentReactionDomain.setUser( commentReactionRequestToUserDomain( commentReactionRequest ) );

        commentReactionDomain.setCreatedAt( getCreateAt() );

        return commentReactionDomain;
    }

    @Override
    public CommentReaction domainToEntity(CommentReactionDomain commentReactionDomain) {
        if ( commentReactionDomain == null ) {
            return null;
        }

        CommentReaction commentReaction = new CommentReaction();

        commentReaction.setUser( userDomainToUser( commentReactionDomain.getUser() ) );
        commentReaction.setComment( commentDomainToComment( commentReactionDomain.getComment() ) );
        commentReaction.setId( commentReactionDomain.getId() );
        commentReaction.setReactionType( commentReactionDomain.getReactionType() );
        commentReaction.setCreatedAt( commentReactionDomain.getCreatedAt() );

        return commentReaction;
    }

    @Override
    public CommentReactionDomain entityToDomain(CommentReaction commentReaction) {
        if ( commentReaction == null ) {
            return null;
        }

        CommentReactionDomain commentReactionDomain = new CommentReactionDomain();

        commentReactionDomain.setUser( userToUserDomain( commentReaction.getUser() ) );
        commentReactionDomain.setComment( commentToCommentDomain( commentReaction.getComment() ) );
        commentReactionDomain.setId( commentReaction.getId() );
        commentReactionDomain.setReactionType( commentReaction.getReactionType() );
        commentReactionDomain.setCreatedAt( commentReaction.getCreatedAt() );

        return commentReactionDomain;
    }

    @Override
    public CommentReactionResponse domainToResponse(CommentReactionDomain commentReactionDomain, UserDomain userDomain) {
        if ( commentReactionDomain == null && userDomain == null ) {
            return null;
        }

        CommentReactionResponse commentReactionResponse = new CommentReactionResponse();

        if ( commentReactionDomain != null ) {
            commentReactionResponse.setId( commentReactionDomain.getId() );
            commentReactionResponse.setUserId( commentReactionDomainUserId( commentReactionDomain ) );
            commentReactionResponse.setReactionType( commentReactionDomain.getReactionType() );
            commentReactionResponse.setCreatedAt( commentReactionDomain.getCreatedAt() );
            commentReactionResponse.setCommentId( commentReactionDomainCommentCommentId( commentReactionDomain ) );
        }
        if ( userDomain != null ) {
            commentReactionResponse.setUsername( userDomain.getUsername() );
            commentReactionResponse.setAvatar( userDomain.getAvatar() );
        }

        return commentReactionResponse;
    }

    protected CommentDomain commentReactionRequestToCommentDomain(CommentReactionRequest commentReactionRequest) {
        if ( commentReactionRequest == null ) {
            return null;
        }

        CommentDomain.CommentDomainBuilder commentDomain = CommentDomain.builder();

        commentDomain.commentId( commentReactionRequest.getCommentId() );

        return commentDomain.build();
    }

    protected UserDomain commentReactionRequestToUserDomain(CommentReactionRequest commentReactionRequest) {
        if ( commentReactionRequest == null ) {
            return null;
        }

        UserDomain.UserDomainBuilder userDomain = UserDomain.builder();

        userDomain.id( getUserId() );

        return userDomain.build();
    }

    protected User userDomainToUser(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userDomain.getId() );
        user.username( userDomain.getUsername() );
        user.email( userDomain.getEmail() );
        user.password( userDomain.getPassword() );
        user.firstName( userDomain.getFirstName() );
        user.lastName( userDomain.getLastName() );
        user.gender( userDomain.getGender() );
        if ( userDomain.getVisibility() != null ) {
            user.visibility( userDomain.getVisibility().name() );
        }
        user.bio( userDomain.getBio() );
        user.location( userDomain.getLocation() );
        user.work( userDomain.getWork() );
        user.education( userDomain.getEducation() );
        user.createdAt( userDomain.getCreatedAt() );
        user.updatedAt( userDomain.getUpdatedAt() );
        user.avatar( userDomain.getAvatar() );
        user.backgroundImage( userDomain.getBackgroundImage() );
        user.dateOfBirth( userDomain.getDateOfBirth() );
        user.isEmailVerified( userDomain.getIsEmailVerified() );

        return user.build();
    }

    protected User userDomainToUser1(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userDomain.getId() );
        user.username( userDomain.getUsername() );
        user.email( userDomain.getEmail() );
        user.password( userDomain.getPassword() );
        user.firstName( userDomain.getFirstName() );
        user.lastName( userDomain.getLastName() );
        user.gender( userDomain.getGender() );
        if ( userDomain.getVisibility() != null ) {
            user.visibility( userDomain.getVisibility().name() );
        }
        user.bio( userDomain.getBio() );
        user.location( userDomain.getLocation() );
        user.work( userDomain.getWork() );
        user.education( userDomain.getEducation() );
        user.createdAt( userDomain.getCreatedAt() );
        user.updatedAt( userDomain.getUpdatedAt() );
        user.avatar( userDomain.getAvatar() );
        user.backgroundImage( userDomain.getBackgroundImage() );
        user.dateOfBirth( userDomain.getDateOfBirth() );
        user.isEmailVerified( userDomain.getIsEmailVerified() );

        return user.build();
    }

    protected Post postDomainToPost(PostDomain postDomain) {
        if ( postDomain == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.id( postDomain.getId() );
        post.content( postDomain.getContent() );
        post.visibility( postDomain.getVisibility() );
        post.createdAt( postDomain.getCreatedAt() );
        post.updatedAt( postDomain.getUpdatedAt() );
        post.lastComment( postDomain.getLastComment() );
        post.photoLists( postDomain.getPhotoLists() );

        return post.build();
    }

    protected Comment commentDomainToComment(CommentDomain commentDomain) {
        if ( commentDomain == null ) {
            return null;
        }

        Comment.CommentBuilder comment = Comment.builder();

        comment.id( commentDomain.getCommentId() );
        comment.user( userDomainToUser1( commentDomain.getUser() ) );
        comment.post( postDomainToPost( commentDomain.getPost() ) );
        comment.parentCommentId( commentDomain.getParentCommentId() );
        comment.content( commentDomain.getContent() );
        comment.createdAt( commentDomain.getCreatedAt() );
        comment.updatedAt( commentDomain.getUpdatedAt() );
        comment.image( commentDomain.getImage() );

        return comment.build();
    }

    protected UserDomain userToUserDomain(User user) {
        if ( user == null ) {
            return null;
        }

        UserDomain.UserDomainBuilder userDomain = UserDomain.builder();

        if ( user.getId() != null ) {
            userDomain.id( user.getId() );
        }
        userDomain.username( user.getUsername() );
        userDomain.password( user.getPassword() );
        userDomain.email( user.getEmail() );
        userDomain.firstName( user.getFirstName() );
        userDomain.lastName( user.getLastName() );
        userDomain.bio( user.getBio() );
        userDomain.gender( user.getGender() );
        userDomain.dateOfBirth( user.getDateOfBirth() );
        userDomain.location( user.getLocation() );
        userDomain.work( user.getWork() );
        userDomain.education( user.getEducation() );
        userDomain.avatar( user.getAvatar() );
        userDomain.backgroundImage( user.getBackgroundImage() );
        if ( user.getVisibility() != null ) {
            userDomain.visibility( Enum.valueOf( Visibility.class, user.getVisibility() ) );
        }
        userDomain.createdAt( user.getCreatedAt() );
        userDomain.updatedAt( user.getUpdatedAt() );
        userDomain.isEmailVerified( user.getIsEmailVerified() );

        return userDomain.build();
    }

    protected UserDomain userToUserDomain1(User user) {
        if ( user == null ) {
            return null;
        }

        UserDomain.UserDomainBuilder userDomain = UserDomain.builder();

        if ( user.getId() != null ) {
            userDomain.id( user.getId() );
        }
        userDomain.username( user.getUsername() );
        userDomain.password( user.getPassword() );
        userDomain.email( user.getEmail() );
        userDomain.firstName( user.getFirstName() );
        userDomain.lastName( user.getLastName() );
        userDomain.bio( user.getBio() );
        userDomain.gender( user.getGender() );
        userDomain.dateOfBirth( user.getDateOfBirth() );
        userDomain.location( user.getLocation() );
        userDomain.work( user.getWork() );
        userDomain.education( user.getEducation() );
        userDomain.avatar( user.getAvatar() );
        userDomain.backgroundImage( user.getBackgroundImage() );
        if ( user.getVisibility() != null ) {
            userDomain.visibility( Enum.valueOf( Visibility.class, user.getVisibility() ) );
        }
        userDomain.createdAt( user.getCreatedAt() );
        userDomain.updatedAt( user.getUpdatedAt() );
        userDomain.isEmailVerified( user.getIsEmailVerified() );

        return userDomain.build();
    }

    protected PostDomain postToPostDomain(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDomain.PostDomainBuilder postDomain = PostDomain.builder();

        postDomain.id( post.getId() );
        postDomain.content( post.getContent() );
        postDomain.visibility( post.getVisibility() );
        postDomain.createdAt( post.getCreatedAt() );
        postDomain.updatedAt( post.getUpdatedAt() );
        postDomain.lastComment( post.getLastComment() );
        postDomain.photoLists( post.getPhotoLists() );

        return postDomain.build();
    }

    protected CommentDomain commentToCommentDomain(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDomain.CommentDomainBuilder commentDomain = CommentDomain.builder();

        commentDomain.commentId( comment.getId() );
        commentDomain.user( userToUserDomain1( comment.getUser() ) );
        commentDomain.post( postToPostDomain( comment.getPost() ) );
        commentDomain.parentCommentId( comment.getParentCommentId() );
        commentDomain.content( comment.getContent() );
        commentDomain.createdAt( comment.getCreatedAt() );
        commentDomain.updatedAt( comment.getUpdatedAt() );
        commentDomain.image( comment.getImage() );

        return commentDomain.build();
    }

    private Long commentReactionDomainUserId(CommentReactionDomain commentReactionDomain) {
        if ( commentReactionDomain == null ) {
            return null;
        }
        UserDomain user = commentReactionDomain.getUser();
        if ( user == null ) {
            return null;
        }
        long id = user.getId();
        return id;
    }

    private Long commentReactionDomainCommentCommentId(CommentReactionDomain commentReactionDomain) {
        if ( commentReactionDomain == null ) {
            return null;
        }
        CommentDomain comment = commentReactionDomain.getComment();
        if ( comment == null ) {
            return null;
        }
        Long commentId = comment.getCommentId();
        if ( commentId == null ) {
            return null;
        }
        return commentId;
    }
}
