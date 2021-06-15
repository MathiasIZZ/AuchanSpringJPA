package fr.mathias.magasinjpa.services;


import fr.mathias.magasinjpa.models.Client;
import fr.mathias.magasinjpa.models.Commande;
import fr.mathias.magasinjpa.repositories.CommandeRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CommandeService {

        private CommandeRepository repository;

    public CommandeService(CommandeRepository repository) {
        this.repository = repository;
    }

    public List<Commande> findAll() {

        return this.repository.findAll();
    }


}
