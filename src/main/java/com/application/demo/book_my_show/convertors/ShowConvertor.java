package com.application.demo.book_my_show.convertors;

import com.application.demo.book_my_show.entity.ShowEntity;
import com.application.demo.book_my_show.entity.UserEntity;
import com.application.demo.book_my_show.requestdtos.ShowRequestDto;
import com.application.demo.book_my_show.requestdtos.UserRequestDto;

public class ShowConvertor {

    public static ShowEntity convertShowRequestDtoToShowEntity (ShowRequestDto showRequestDto){

        ShowEntity showEntity =
                ShowEntity.builder().showDateTime(showRequestDto.getShowDateTime()).showType(showRequestDto.getShowType())
                        .build();

        return showEntity;

    }
}
