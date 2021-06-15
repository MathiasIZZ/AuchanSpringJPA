package fr.mathias.magasinjpa.controllers;

import fr.mathias.magasinjpa.models.Commande;
import fr.mathias.magasinjpa.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    @Autowired
    CommandeService service;

    @GetMapping()
    public List<Commande> findAll() {
        return this.service.findAll();
    }




}
