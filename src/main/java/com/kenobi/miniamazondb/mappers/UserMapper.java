package com.kenobi.miniamazondb.mappers;

import com.kenobi.miniamazondb.dto.UserDto;
import com.kenobi.miniamazondb.entities.User;

public class UserMapper {

    public UserDto ArticleToArticleDto(User user){
        if(user == null){
            return null;
        }

        return new UserDto(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());
    }




    public User UserDtoToUser(UserDto userDto){
        if(userDto == null){
            return null;
        }

        return new User(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail());
    }
}
