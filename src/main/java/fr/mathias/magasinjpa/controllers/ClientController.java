package fr.mathias.magasinjpa.controllers;

import fr.mathias.magasinjpa.config.ClientConfig;
import fr.mathias.magasinjpa.dtos.GetClientDTO;
import fr.mathias.magasinjpa.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping
    public List<GetClientDTO> findAll() {

        return this.service.findAll();
    }











}
