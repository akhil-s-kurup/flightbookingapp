package org.airkerala.service;

import org.airkerala.dto.BookingDto;
import org.airkerala.entity.Flight;
import org.airkerala.entity.User;
import org.springframework.stereotype.Service;


public interface BookingService {
    public String getBookingStatus();
    public boolean bookFlight(BookingDto bookingDto);

    void addFlight(Flight flight);

    void addUser(User user);
}
