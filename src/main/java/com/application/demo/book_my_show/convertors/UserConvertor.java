package com.application.demo.book_my_show.convertors;

import com.application.demo.book_my_show.entity.UserEntity;
import com.application.demo.book_my_show.requestdtos.UserRequestDto;

public class UserConvertor {

//        use of static = without creating object or instance we can call/access  directly

    public static UserEntity convertUserRequestDtoToUserEntity (UserRequestDto userRequestDto){

        UserEntity userEntity =
                UserEntity.builder().name(userRequestDto.getName()).age(userRequestDto.getAge())
                        .email(userRequestDto.getEmail()).mobile(userRequestDto.getMobile())
                        .address(userRequestDto.getAddress()).build();

        return userEntity;

    }
}
