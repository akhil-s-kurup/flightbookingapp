package org.airkerala.service;

import org.airkerala.dao.BookingDao;
import org.airkerala.dao.FlightDao;
import org.airkerala.dao.UserDao;
import org.airkerala.dto.BookingDto;
import org.airkerala.entity.Flight;
import org.airkerala.entity.FlightBooking;
import org.airkerala.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDao bookingDao;

    @Autowired
    FlightDao flightDao;

    @Autowired
    UserDao userDao;

    @Override
    public String getBookingStatus() {
        return "";
    }

    @Override
    public boolean bookFlight(BookingDto bookingDto) {
        FlightBooking flightBooking = new FlightBooking();
        Flight flight=flightDao.findById(bookingDto.getFlightId()).get();
        User user=userDao.findById(bookingDto.getUserId()).get();
        flightBooking.setFlight(flight);
        flightBooking.setUser(user);
        flightBooking.setNoOfSeats(bookingDto.getNoOfSeats());
        flightBooking.setBookingDate(bookingDto.getBookingDate());
        FlightBooking save = bookingDao.save(flightBooking);
        return save != null;
    }

    @Override
    public void addFlight(Flight flight) {
        flightDao.save(flight);
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
}
