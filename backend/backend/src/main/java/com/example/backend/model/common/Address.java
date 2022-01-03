package com.example.backend.model.common;

import lombok.Data;
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

    private String street;
    private String houseNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
}
