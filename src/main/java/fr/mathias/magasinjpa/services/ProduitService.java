package fr.mathias.magasinjpa.services;

import fr.mathias.magasinjpa.models.Produit;
import fr.mathias.magasinjpa.repositories.ProduitRepository;

import java.util.List;

public class ProduitService {

    private ProduitRepository repository;

    public ProduitService(ProduitRepository repository) {
        this.repository = repository;
    }

    public List<Produit> findAll() {
        return this.repository.findAll();
    }
}
