package com.example.backend.model.common;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "address_id", nullable = false, unique = true)
    private UUID addressId;

    @Column(name = "street", nullable = false, unique=true)
    private String street;


    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    public Address(String street, int houseNumber, City city) {
        this.street = street;
        this.city = city;

    }

}
