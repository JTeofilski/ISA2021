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
@Table(name = "KORISNICI")
public class Korisnik {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "korisnik_id", nullable = false, unique = true)
    private UUID korisniK_id;

    private String emailAdresa;
    private String lozinka;
    private String ime;
    private String prezime;
    private String adresaPrebivalista;
    private String grad;
    private String drzava;
    private String brojTelefona;

}
