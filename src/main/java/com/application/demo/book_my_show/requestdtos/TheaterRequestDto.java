package com.application.demo.book_my_show.requestdtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TheaterRequestDto {

    private String name;

    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;
}
