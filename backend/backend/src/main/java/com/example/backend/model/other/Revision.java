package com.example.backend.model.other;

import com.example.backend.model.enums.RevisionStatus;
import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Instructor;
import com.example.backend.model.users.ShipOwner;
import lombok.Cleanup;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "revisions")
public class Revision {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "revision_id", nullable = false, unique = true)
    private UUID revisionId;

    @Column
    private String comment;

    @Column
    private Integer grade;

    @Column
    private RevisionStatus revisionStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    private House house;

    @ManyToOne(fetch = FetchType.LAZY)
    private HouseOwner houseOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    private Ship ship;

    @ManyToOne(fetch = FetchType.LAZY)
    private ShipOwner shipOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    private Instructor instructor;
}
