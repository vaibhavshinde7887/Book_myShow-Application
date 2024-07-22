package com.application.demo.book_my_show.controller;

import com.application.demo.book_my_show.entity.ShowEntity;
import com.application.demo.book_my_show.entity.TicketEntity;
import com.application.demo.book_my_show.enums.ShowType;
import com.application.demo.book_my_show.requestdtos.ShowRequestDto;
import com.application.demo.book_my_show.requestdtos.TicketRequestDto;
import com.application.demo.book_my_show.service.ShowService;
import com.application.demo.book_my_show.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public ResponseEntity<?> bookTicket(@RequestBody TicketRequestDto ticketRequestDto) {
        try {
            String response = ticketService.addTicket(ticketRequestDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String msg = "Ticket could not be booked : " + e.getMessage();
            return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getticketlessthan500price")
    public ResponseEntity<?> getTicketsByPriceLessThan500() {
        try {
            List<TicketEntity> response = ticketService.getTicketsByPriceLessThan500();
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String msg = "Tickets could not be found : " + e.getMessage();
            return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
        }
    }
}
