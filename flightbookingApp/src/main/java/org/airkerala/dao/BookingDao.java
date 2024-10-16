package org.airkerala.dao;

import org.airkerala.entity.FlightDetails;
import org.airkerala.entity.Users;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookingDao extends JpaRepository<Users, Integer> {


}
