package org.airkerala.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flight_booking")
@Getter
@Setter
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "flightId",nullable = false)
    private Flight flight;

    private boolean bookingStatus;

    private int noOfSeats;

    private LocalDate bookingDate;

}
