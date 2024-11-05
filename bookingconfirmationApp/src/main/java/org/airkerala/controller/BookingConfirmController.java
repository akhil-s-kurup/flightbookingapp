package org.airkerala.controller;

import jakarta.annotation.PostConstruct;
import org.airkerala.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/comfirmBooking")
public class BookingConfirmController {

    @Autowired
    FlightBookingService bookingService;

    @PostMapping("/statusUpdate")
    public boolean confirmBooking(@RequestParam("statusCode") Integer bookingId){

       return bookingService.confirmBooking(bookingId);
    }


}
