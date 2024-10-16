package org.airkerala.service;

import org.airkerala.dto.BookingDto;
import org.springframework.stereotype.Service;


public interface BookingService {
    public String getBookingStatus();
    public boolean bookFlight(BookingDto bookingDto);
}
