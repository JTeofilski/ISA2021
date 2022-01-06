package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

// za rezervacije i zaradu aplikacije
@Data
@Entity
@Table(name = "panels")
public class AppPanel {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "app_id", nullable = false, unique = true)
    private UUID appId;


    @Column
    private Double percentPerReservation;

    @Column
    private Double totalMoney;


}
