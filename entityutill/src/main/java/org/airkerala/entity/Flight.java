package org.airkerala.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "flight_details")
@Getter
@Setter
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flightId;
    private String flightName;
    private int capacity;

    public Flight() {
    }

    public Flight(String flightName, int capacity) {
        this.flightName = flightName;
        this.capacity = capacity;
    }

}
