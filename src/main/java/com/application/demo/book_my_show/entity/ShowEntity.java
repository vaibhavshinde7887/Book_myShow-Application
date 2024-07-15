package com.application.demo.book_my_show.entity;


import com.application.demo.book_my_show.enums.ShowType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "shows")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private Date showDateTime;


    private Date createdOn;


    private Date updatedOn;

    @Enumerated(value = EnumType.STRING)
    private ShowType showType;
}
