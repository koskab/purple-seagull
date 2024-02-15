package com.example.alabstest.users.mapper;

import com.example.alabstest.users.dto.UserCreate;
import com.example.alabstest.users.dto.UserIdView;
import com.example.alabstest.users.dto.UserUpdate;
import com.example.alabstest.users.dto.UserView;
import com.example.alabstest.users.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(builder = @Builder(disableBuilder = true))
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserView userView);

    User toEntity(UserCreate userCreate);

    User toEntity(UserUpdate userUpdate);

    UserIdView toView(Long id);

    UserView toView(User user);


}
