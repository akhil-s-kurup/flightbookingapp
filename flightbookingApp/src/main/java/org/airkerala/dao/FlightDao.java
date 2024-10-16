package org.airkerala.dao;

import org.airkerala.entity.Flight;
import org.airkerala.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDao extends JpaRepository<Flight, Integer> {
}
