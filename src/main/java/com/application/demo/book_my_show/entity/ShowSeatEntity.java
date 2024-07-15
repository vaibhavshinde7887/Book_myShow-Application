package com.application.demo.book_my_show.entity;
import com.application.demo.book_my_show.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "show_seats")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean isBooked;

    private int price;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;

    private Date bookedAt;
}
