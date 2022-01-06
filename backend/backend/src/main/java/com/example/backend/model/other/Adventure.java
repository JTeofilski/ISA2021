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
    @Column(name = "adventure_id", nullable = false, unique = true)
    private UUID adventureId;

    @Column(name = "adventure_name")
    String adventureName;

    @Column(name = "adventure_address")
    String advetureAddress;

    @Column(name = "adventure_description")
    String adventureDescription;

    @Column(name = "adventure_grade")
    Double adventureGrade;

    @OneToOne(fetch = FetchType.LAZY)
    Instructor instructor;
}
