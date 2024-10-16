package org.airkerala.service;

import org.airkerala.dao.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDao bookingDao;

    @Override
    public String getBookingStatus() {
        return "";
    }

    @Override
    public boolean bookFlight() {
        return true;
    }
}
