package com.example.backend.model.other;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "serves")
public class Serve {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "serve_id", nullable = false, unique = true)
    private UUID serveId;

    @Column(name = "serve_name")
    private String serveName;

    @ManyToOne(fetch = FetchType.LAZY)
    private House house;
}
