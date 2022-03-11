package com.example.backend.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "city_name", nullable = false, unique=true)
    private String name;

    @Column(name = "post_code", nullable = false, unique=true)
    private Integer postCode;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    @Fetch(value = FetchMode.SELECT)
    private Set<Address> addresses = new HashSet<Address>();

    public City(String name, int postCode, Country country){
        this.name = name;
        this.postCode = postCode;
        this.country = country;
    }

}
