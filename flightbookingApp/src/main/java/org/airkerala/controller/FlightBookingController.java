package org.airkerala.controller;

import org.airkerala.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/flightbooking")
public class FlightBookingController {

    @Autowired
    BookingService service;

    @GetMapping("/bookingStatus")
    public String getBookingStatus() {
        return service.getBookingStatus();
    }

    @PostMapping("/bookFlight")
    public boolean bookFlight() {
        return service.bookFlight();
    }

}
