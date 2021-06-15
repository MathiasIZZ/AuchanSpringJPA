package fr.mathias.magasinjpa.controllers;

import fr.mathias.magasinjpa.models.Client;
import fr.mathias.magasinjpa.models.Commande;
import fr.mathias.magasinjpa.services.ClientService;
import fr.mathias.magasinjpa.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    @Autowired
    CommandeService service;

    ClientService clientService;


    @GetMapping()
    public List<Commande> findAll() {
        return this.service.findAll();
    }

    @GetMapping("client/{id}")
    public List<Commande> findAllCommandesFromClient(@PathVariable int id) {

        Optional<Client> client = clientService.findById(id);

        



        return;
    }


}
