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
@Table(name = "VIKENDICE")
public class Vikendica {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "vikendica_id", nullable = false, unique = true)
    private UUID vikendica_id;

    @Column(name = "nazivVikendice", nullable = false, unique = true)
    private String nazivVikendice;

    @Column(name = "adresaVikendice", nullable = false)
    private String adresaVikendice;

    @Column(name = "promotvniOpisVikendice")
    private String promotvniOpisVikendice;

    @Column(name = "prosecnaOcenaVikendice")
    private Double prosecnaOcenaVikendice;

}
