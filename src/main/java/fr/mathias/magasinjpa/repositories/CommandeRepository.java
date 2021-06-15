package fr.mathias.magasinjpa.repositories;

import fr.mathias.magasinjpa.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
