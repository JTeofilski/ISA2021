package model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.SplittableRandom;
import java.util.UUID;

@Data
@Entity
@Table(name = "BRODOVI")
public class Brod {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "brod_id", nullable = false, unique = true)
    private UUID brod_id;

    @Column(name = "nazivBroda", nullable = false, unique = true)
    private String nazivBroda;

    @Column(name = "lokacijaBroda", nullable = false)
    private String lokacijaBroda;

    @Column(name = "promotivniOpisBroda")
    private String promotivniOpisBroda;

    @Column(name = "prosecnaOcenaBroda")
    private Double prosecnaOcenaBroda;


    private String infoOSlobTerminima; //??
    private String cenovnik; //??
    private String dodatneUsluge; //??
}
