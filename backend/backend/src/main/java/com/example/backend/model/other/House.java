package com.example.backend.model.other;

import com.example.backend.model.common.Address;
import com.example.backend.model.common.Country;
import com.example.backend.model.users.HouseOwner;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "house_name")
    private String houseName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;

    @Column(name = "house_description")
    private String houseDescription;

    @Column(name = "house_grade")
    private Double houseGrade;

    @OneToOne(fetch = FetchType.LAZY)
    private HouseOwner houseOwner;

    // slike enter i ekster


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    private Set<Room> rooms = new HashSet<Room>();

    @Column
    private String behaviour;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    private Set<Serve> serves = new HashSet<Serve>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    private Set<Reservation> reservations = new HashSet<Reservation>();

    @Column
    private Boolean deleted;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "house")
    private Set<Revision> revisions = new HashSet<Revision>();

}
