package com.example.backend.model.common;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

    @Column(name = "city_name", nullable = false, unique=true)
    private String name;

    @Column(name = "post_code", nullable = false, unique=true)
    private Integer postCode;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private Set<Address> addresses = new HashSet<Address>();

    public City(String name, int postCode, Country country){
        this.name = name;
        this.postCode = postCode;
        this.country = country;
    }

}
