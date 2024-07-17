package com.application.demo.book_my_show.service;


import com.application.demo.book_my_show.convertors.UserConvertor;
import com.application.demo.book_my_show.entity.UserEntity;
import com.application.demo.book_my_show.repository.UserRepository;
import com.application.demo.book_my_show.requestdtos.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
   private UserRepository userRepository;

//    @Autowired
//    private UserRepository userRepository;

//    @Autowired
//    private UserRepo userRepo;

    public String addUser(UserRequestDto userRequestDto)throws Exception{

       UserEntity userEntity = UserConvertor.convertUserRequestDtoToUserEntity(userRequestDto);

        userRepository.save(userEntity);

       return "User Added Successfully";
    }
}
