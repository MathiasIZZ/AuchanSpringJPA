package fr.mathias.magasinjpa.repositories;

import fr.mathias.magasinjpa.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {



}
