package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ship_id", nullable = false, unique = true)
    private UUID shipId;

    @Column(name = "shipname")
    private String shipName;

    @Column(name = "shipaddress")
    private String shipAddress;

    @Column(name = "shipdescription")
    String shipDescription;

    @Column(name = "shipgrade")
    Double shipGrade;

    // Klasa termini,cenovnik, dodatne usuluge ima vezu neku sa  brodom
    //informacije o slobodnim terminima,
    //prikaz cenovnika i dodatnih usluga koje se uz rezervaciju mogu koristiti.

}
