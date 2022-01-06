package com.example.backend.model.common;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

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

    @Column(name = "house_number", nullable = false, unique=true)
    private Integer houseNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    public Address(String street, int houseNumber, City city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;

    }

}
