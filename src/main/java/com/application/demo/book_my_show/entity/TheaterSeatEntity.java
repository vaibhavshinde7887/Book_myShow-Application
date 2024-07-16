package com.application.demo.book_my_show.entity;


import com.application.demo.book_my_show.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "theater_seats")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;

    //    this is child with respect to show

    @JoinColumn
    @ManyToOne
    private TheaterEntity theaterEntity;

}
