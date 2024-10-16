package org.airkerala.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookingDto {

    int flightId;
    int userId;
    int noOfSeats;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate bookingDate;
    boolean bookingStatus;

}
