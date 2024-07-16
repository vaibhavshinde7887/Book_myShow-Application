package com.application.demo.book_my_show.requestdtos;

import lombok.Data;

@Data
public class TheaterRequestDto {


    private String name;

    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;



}
