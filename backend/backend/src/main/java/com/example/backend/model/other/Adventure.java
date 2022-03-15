package com.example.backend.model.other;

import com.example.backend.model.users.Instructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "adventures")
public class Adventure {
    // Profil stranica instruktora pecanja: prikazuju se osnovni podaci o avanturi koju instruktor pruža kao što su

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "adv_name")
    String adventureName;

    @Column(name = "adv_address")
    String advetureAddress;

    @Column(name = "adv_description")
    String adventureDescription;

    @Column(name = "adv_grade")
    Double adventureGrade;

    @OneToOne(fetch = FetchType.LAZY)
    Instructor instructor;
}
