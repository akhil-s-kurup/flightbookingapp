package org.airkerala.dao;

import org.airkerala.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FlightBookingDao extends JpaRepository<FlightBooking, Integer> {

}
