package fr.mathias.magasinjpa.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String nom;

    private  double prix;

    @ManyToOne
    @JoinColumn(name="categorie_id", referencedColumnName = "id")
    private Categorie categorie;








}
