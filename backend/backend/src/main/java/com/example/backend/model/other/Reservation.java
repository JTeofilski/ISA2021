package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "reservation_id", nullable = false, unique = true)
    private UUID reservationId;

    @Column
    private LocalDateTime start;

    @Column
    private Integer duration;

    @Column
    private Integer numberOfPeople;

    @ManyToOne(fetch = FetchType.LAZY)
    private House house;

    @Column
    private Double pricePerDay;

    @Column
    private Double totalPrice;



}
