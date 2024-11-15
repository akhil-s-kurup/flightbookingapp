package org.airkerala.service;

import org.airkerala.dao.FlightBookingDao;
import org.airkerala.entity.FlightBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements  FlightBookingService{

    @Autowired
    FlightBookingDao flightBookingDao;

    @Override
    public boolean confirmBooking(Integer bookingId) {
        FlightBooking flightBooking = flightBookingDao.getById(bookingId);
        if(flightBooking!=null) {
            flightBooking.setBookingStatus(true);
            flightBookingDao.save(flightBooking);
            return true;
        }
        else
            return false;
    }

}
