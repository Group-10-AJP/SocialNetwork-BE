package com.example.socialnetwork.common.mapper;

import com.example.socialnetwork.application.response.ProfileResponse;
import com.example.socialnetwork.common.constant.Visibility;
import com.example.socialnetwork.domain.model.UserDomain;
import com.example.socialnetwork.infrastructure.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-16T21:37:09+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public ProfileResponse toProfileResponse(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        ProfileResponse.ProfileResponseBuilder profileResponse = ProfileResponse.builder();

        profileResponse.id( String.valueOf( userDomain.getId() ) );
        profileResponse.username( userDomain.getUsername() );
        profileResponse.email( userDomain.getEmail() );
        profileResponse.firstName( userDomain.getFirstName() );
        profileResponse.lastName( userDomain.getLastName() );
        profileResponse.gender( userDomain.getGender() );
        if ( userDomain.getVisibility() != null ) {
            profileResponse.visibility( userDomain.getVisibility().name() );
        }
        profileResponse.bio( userDomain.getBio() );
        profileResponse.location( userDomain.getLocation() );
        profileResponse.work( userDomain.getWork() );
        profileResponse.education( userDomain.getEducation() );
        profileResponse.createdAt( userDomain.getCreatedAt() );
        profileResponse.updatedAt( userDomain.getUpdatedAt() );
        profileResponse.avatar( userDomain.getAvatar() );
        profileResponse.backgroundImage( userDomain.getBackgroundImage() );
        profileResponse.dateOfBirth( userDomain.getDateOfBirth() );

        return profileResponse.build();
    }

    @Override
    public UserDomain toUserDomain(User user) {
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

    @Override
    public List<UserDomain> toUserDomains(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDomain> list = new ArrayList<UserDomain>( users.size() );
        for ( User user : users ) {
            list.add( toUserDomain( user ) );
        }

        return list;
    }
}
