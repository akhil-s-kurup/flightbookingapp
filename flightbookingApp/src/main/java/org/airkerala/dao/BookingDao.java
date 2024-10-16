package org.airkerala.dao;


import org.airkerala.dto.BookingDto;
import org.airkerala.entity.FlightBooking;
import org.airkerala.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookingDao extends JpaRepository<FlightBooking, Integer> {

}
