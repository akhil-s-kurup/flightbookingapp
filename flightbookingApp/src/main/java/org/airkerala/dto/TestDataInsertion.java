package org.airkerala.dto;

import jakarta.annotation.PostConstruct;
import org.airkerala.entity.Flight;
import org.airkerala.entity.User;
import org.airkerala.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class TestDataInsertion{

    private static final Logger logger = LoggerFactory.getLogger(TestDataInsertion.class);
    @Autowired
    BookingService bookingService;

    @PostConstruct
    public  void insert()
    {

        logger.info("Inserting dummy data");
        User user=new User("akhil","akhil@123", Collections.emptySet());
        Flight flight=new Flight("IND-SAU",1500);
        bookingService.addFlight(flight);
        bookingService.addUser(user);
    }

}

