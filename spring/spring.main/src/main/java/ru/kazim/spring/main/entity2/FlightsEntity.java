package ru.kazim.spring.main.entity2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
@Data
@Table(schema = "bookings", name = "flights")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FlightsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long flight_id;
    private String flight_no;
    private Timestamp scheduled_departure;
    private Timestamp scheduled_arrival;
    private String departure_airport;
    private String arrival_airport;
    private String status;
    private String aircraft_code;
    private Timestamp actual_departure;
    private Timestamp actual_arrival;
}
