package com.example.backend.model.other;

import com.example.backend.model.common.Country;
import lombok.Data;
import org.apache.tomcat.jni.Address;
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

    @Column(name = "house_name")
    private String houseName;

    // kako ovo resiti, da na jednoj adres moze biti samo jedna kuca?
    @Column(name = "house_address")
    private String houseAddress;

    @Column(name = "house_description")
    private String houseDescription;

    @Column(name = "house_grade")
    private Double houseGrade;



}
