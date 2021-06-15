package fr.mathias.magasinjpa.models;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String numero;

    @ManyToOne
    @JoinColumn(name="client_id", referencedColumnName = "id")
    private Client client;


    @ManyToMany
    @JoinTable(
            name="produit_has_commande",
            joinColumns = @JoinColumn(name="commande_id"),
            inverseJoinColumns = @JoinColumn(name="produit_id")

    )
    private List<Produit> produits;

















}
