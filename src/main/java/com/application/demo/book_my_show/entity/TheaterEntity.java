package com.application.demo.book_my_show.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theaters")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    // this is parent wrt to shows
    @OneToMany(mappedBy = "theaterEntity", cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows = new ArrayList<>();

    // this is parent wrt to theater seat
    @OneToMany(mappedBy = "theaterEntity", cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> listOfTheaterSeats = new ArrayList<>();



}
