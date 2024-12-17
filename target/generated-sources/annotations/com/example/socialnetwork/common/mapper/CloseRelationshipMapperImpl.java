package com.example.socialnetwork.common.mapper;

import com.example.socialnetwork.application.request.CloseRelationshipRequest;
import com.example.socialnetwork.application.response.CloseRelationshipResponse;
import com.example.socialnetwork.common.constant.Visibility;
import com.example.socialnetwork.domain.model.CloseRelationshipDomain;
import com.example.socialnetwork.domain.model.UserDomain;
import com.example.socialnetwork.infrastructure.entity.CloseRelationship;
import com.example.socialnetwork.infrastructure.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T21:37:09+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class CloseRelationshipMapperImpl implements CloseRelationshipMapper {

    @Override
    public CloseRelationshipDomain requestToDomain(CloseRelationshipRequest request, UserDomain userDomain) {
        if ( request == null && userDomain == null ) {
            return null;
        }

        CloseRelationshipDomain closeRelationshipDomain = new CloseRelationshipDomain();

        if ( request != null ) {
            closeRelationshipDomain.setCloseRelationshipName( request.getCloseRelationshipName() );
            if ( closeRelationshipDomain.getUser() == null ) {
                closeRelationshipDomain.setUser( UserDomain.builder().build() );
            }
            closeRelationshipRequestToUserDomain( request, closeRelationshipDomain.getUser() );
        }
        if ( userDomain != null ) {
            closeRelationshipDomain.setTargetUser( userDomainToUserDomain( userDomain ) );
            closeRelationshipDomain.setId( userDomain.getId() );
        }
        closeRelationshipDomain.setCreatedAt( getCreateAt() );

        return closeRelationshipDomain;
    }

    @Override
    public CloseRelationship domainToEntity(CloseRelationshipDomain domain) {
        if ( domain == null ) {
            return null;
        }

        CloseRelationship closeRelationship = new CloseRelationship();

        closeRelationship.setUser( userDomainToUser( domain.getUser() ) );
        closeRelationship.setTargetUser( userDomainToUser1( domain.getTargetUser() ) );
        closeRelationship.setId( domain.getId() );
        closeRelationship.setCloseRelationshipName( domain.getCloseRelationshipName() );
        closeRelationship.setCreatedAt( domain.getCreatedAt() );

        return closeRelationship;
    }

    @Override
    public CloseRelationshipDomain entityToDomain(CloseRelationship relationship) {
        if ( relationship == null ) {
            return null;
        }

        CloseRelationshipDomain closeRelationshipDomain = new CloseRelationshipDomain();

        closeRelationshipDomain.setUser( userToUserDomain( relationship.getUser() ) );
        closeRelationshipDomain.setTargetUser( userToUserDomain1( relationship.getTargetUser() ) );
        closeRelationshipDomain.setId( relationship.getId() );
        closeRelationshipDomain.setCloseRelationshipName( relationship.getCloseRelationshipName() );
        closeRelationshipDomain.setCreatedAt( relationship.getCreatedAt() );

        return closeRelationshipDomain;
    }

    @Override
    public CloseRelationshipResponse domainToResponse(CloseRelationshipDomain domain) {
        if ( domain == null ) {
            return null;
        }

        CloseRelationshipResponse closeRelationshipResponse = new CloseRelationshipResponse();

        closeRelationshipResponse.setUserId( domainUserId( domain ) );
        closeRelationshipResponse.setTargetUserId( domainTargetUserId( domain ) );
        closeRelationshipResponse.setTargetUsername( domainTargetUserUsername( domain ) );
        closeRelationshipResponse.setCloseRelationshipName( domain.getCloseRelationshipName() );
        closeRelationshipResponse.setCreatedAt( domain.getCreatedAt() );

        return closeRelationshipResponse;
    }

    protected UserDomain userDomainToUserDomain(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        UserDomain.UserDomainBuilder userDomain1 = UserDomain.builder();

        userDomain1.id( userDomain.getId() );
        userDomain1.username( userDomain.getUsername() );
        userDomain1.avatar( userDomain.getAvatar() );

        return userDomain1.build();
    }

    protected void closeRelationshipRequestToUserDomain(CloseRelationshipRequest closeRelationshipRequest, UserDomain mappingTarget) {
        if ( closeRelationshipRequest == null ) {
            return;
        }

        mappingTarget.setId( getUserId() );
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

    private Long domainUserId(CloseRelationshipDomain closeRelationshipDomain) {
        if ( closeRelationshipDomain == null ) {
            return null;
        }
        UserDomain user = closeRelationshipDomain.getUser();
        if ( user == null ) {
            return null;
        }
        long id = user.getId();
        return id;
    }

    private Long domainTargetUserId(CloseRelationshipDomain closeRelationshipDomain) {
        if ( closeRelationshipDomain == null ) {
            return null;
        }
        UserDomain targetUser = closeRelationshipDomain.getTargetUser();
        if ( targetUser == null ) {
            return null;
        }
        long id = targetUser.getId();
        return id;
    }

    private String domainTargetUserUsername(CloseRelationshipDomain closeRelationshipDomain) {
        if ( closeRelationshipDomain == null ) {
            return null;
        }
        UserDomain targetUser = closeRelationshipDomain.getTargetUser();
        if ( targetUser == null ) {
            return null;
        }
        String username = targetUser.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
