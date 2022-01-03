package com.example.backend.model.common;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "city_id", nullable = false, unique = true)
    private UUID cityId;

    private String name;
    private Integer postCode;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private Set<Address> addresses = new HashSet<>();

}
