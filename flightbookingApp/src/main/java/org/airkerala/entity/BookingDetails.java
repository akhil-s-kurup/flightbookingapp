package org.airkerala.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @ManyToOne
    private FlightDetails flightDetails;

    @ManyToOne
    private Users users;

    // Constructors
    public BookingDetails() {
    }

    public BookingDetails(FlightDetails flightDetails, Users users) {
        this.flightDetails = flightDetails;
        this.users = users;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(FlightDetails flightDetails) {
        this.flightDetails = flightDetails;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "bookingId=" + bookingId +
                ", flightDetails=" + flightDetails +
                ", users=" + users +
                '}';
    }
}
