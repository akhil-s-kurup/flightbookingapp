package org.airkerala.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FlightDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flightId;
    private String flightName;
    private String source;
    private String destination;
    private int noOfSeats;
    private int availableSeats;
    private double ticketPrice;

    public FlightDetails() {
    }

    public FlightDetails(String flightName, String source, String destination, int noOfSeats, int availableSeats, double ticketPrice) {
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", availableSeats=" + availableSeats +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
