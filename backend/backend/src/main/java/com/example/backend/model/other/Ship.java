package com.example.backend.model.other;

import com.example.backend.model.common.Address;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "ship_name")
    private String shipName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Address shipAddress;

    @Column(name = "ship_description")
    String shipDescription;

    @Column(name = "ship_grade")
    Double shipGrade;

    // Klasa termini,cenovnik, dodatne usuluge ima vezu neku sa  brodom
    //informacije o slobodnim terminima,
    //prikaz cenovnika i dodatnih usluga koje se uz rezervaciju mogu koristiti.


    @Column
    private Boolean deleted;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ship")
    private Set<Revision> revisions = new HashSet<Revision>();

}
