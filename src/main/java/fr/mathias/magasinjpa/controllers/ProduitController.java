package fr.mathias.magasinjpa.controllers;


import fr.mathias.magasinjpa.models.Produit;
import fr.mathias.magasinjpa.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

    @Autowired
    ProduitService service;

    @GetMapping
    public List<Produit> findAll() {

        return this.service.findAll();
    }





}
