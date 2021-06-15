package fr.mathias.magasinjpa.controllers;

import fr.mathias.magasinjpa.dtos.GetClientDTO;
import fr.mathias.magasinjpa.models.Client;
import fr.mathias.magasinjpa.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController implements Serializable {

    @Autowired
    ClientService service;

    @GetMapping
    public List<GetClientDTO> findAll() {

        return this.service.findAll();
    }


     @GetMapping("{id}")
     public Optional<Client> findById(@PathVariable int id) {

        return this.service.getById(id);
     }


    @PostMapping
    public Client save(@RequestBody Client client) {

        return this.service.save(client);
    }

















}
