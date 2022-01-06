package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "room_id", nullable = false, unique = true)
    private UUID roomId;

    @ManyToOne(fetch = FetchType.LAZY)
    private House house;

    @Column
    private Integer numberOfBeds;


}
