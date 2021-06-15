package fr.mathias.magasinjpa.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.mathias.magasinjpa.dtos.GetClientDTO;
import fr.mathias.magasinjpa.models.Client;
import fr.mathias.magasinjpa.repositories.ClientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientService {

    private ClientRepository repository;
    private ObjectMapper mapper;

    public ClientService(ClientRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<GetClientDTO> findAll() {

        List<Client> clients = this.repository.findAll();
        List<GetClientDTO> getClientsDTO = new ArrayList<>();

        clients.forEach( client -> {
            getClientsDTO.add(
                    this.mapper.convertValue(client, GetClientDTO.class)
            );
        });
        return getClientsDTO;
    }

    public Client save(Client client) {
        return this.repository.save(client);
    }



    public Optional<Client> getById(int id) {

        return this.repository.findById(id);
    }




}
