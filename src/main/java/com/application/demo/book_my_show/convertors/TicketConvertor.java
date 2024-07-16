package com.application.demo.book_my_show.convertors;

import com.application.demo.book_my_show.entity.TicketEntity;
import com.application.demo.book_my_show.entity.UserEntity;
import com.application.demo.book_my_show.requestdtos.TicketRequestDto;
import com.application.demo.book_my_show.requestdtos.UserRequestDto;

public class TicketConvertor {

//        use of static = without creating object or instance we can call/access  directly

    public static TicketEntity convertTicketRequestDtoToTicketEntity (TicketRequestDto ticketRequestDto){

        TicketEntity ticketEntity = TicketEntity.builder().build();

        return ticketEntity;

    }
}
