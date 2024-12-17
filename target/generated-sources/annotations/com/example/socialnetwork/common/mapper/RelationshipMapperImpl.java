package com.example.socialnetwork.common.mapper;

import com.example.socialnetwork.common.constant.Visibility;
import com.example.socialnetwork.domain.model.RelationshipDomain;
import com.example.socialnetwork.domain.model.UserDomain;
import com.example.socialnetwork.infrastructure.entity.Relationship;
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
public class RelationshipMapperImpl implements RelationshipMapper {

    @Override
    public RelationshipDomain toRelationshipDomain(Relationship relationship) {
        if ( relationship == null ) {
            return null;
        }

        RelationshipDomain relationshipDomain = new RelationshipDomain();

        relationshipDomain.setId( relationship.getId() );
        relationshipDomain.setUser( userToUserDomain( relationship.getUser() ) );
        relationshipDomain.setFriend( userToUserDomain( relationship.getFriend() ) );
        relationshipDomain.setRelation( relationship.getRelation() );
        relationshipDomain.setCreatedAt( relationship.getCreatedAt() );

        return relationshipDomain;
    }

    @Override
    public List<RelationshipDomain> toRelationshipDomain(List<Relationship> relationships) {
        if ( relationships == null ) {
            return null;
        }

        List<RelationshipDomain> list = new ArrayList<RelationshipDomain>( relationships.size() );
        for ( Relationship relationship : relationships ) {
            list.add( toRelationshipDomain( relationship ) );
        }

        return list;
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
}
