package fr.mathias.magasinjpa.models;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="categorie")
public class Categorie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

}
