package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "house_id", nullable = false, unique = true)
    private UUID houseId;

    @Column(name = "housename")
    private String houseName;

    @Column(name = "houseaddress")
    private String houseAddress;

    @Column(name = "housedescription")
    private String houseDescription;

    @Column(name = "housegrade")
    private Double houseGrade;

}
