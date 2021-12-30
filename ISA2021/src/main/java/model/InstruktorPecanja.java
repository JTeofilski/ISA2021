package model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.UUID;

@Data
@Entity
@Table(name = "INSTRUKTORI")
public class InstruktorPecanja {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "instruktor_id", nullable = false, unique = true)
    private UUID instruktor_id;

    @Column(name = "nazivInstruktora", nullable = false, unique = true)
    private String nazivInstruktora;

    @Column(name = "adresaInstruktora", nullable = false)
    private String adresaInstruktora;

    @Column(name = "promotvniOpisnstruktora")
    private String promotvniOpisnstruktora;

    @Column(name = "prosecnaOcenaInstruktora")
    private Double prosecnaOcenaInstruktora;

}
