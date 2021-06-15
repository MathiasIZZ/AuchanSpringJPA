package fr.mathias.magasinjpa.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.mathias.magasinjpa.repositories.ClientRepository;
import fr.mathias.magasinjpa.repositories.CommandeRepository;
import fr.mathias.magasinjpa.repositories.ProduitRepository;
import fr.mathias.magasinjpa.services.ClientService;
import fr.mathias.magasinjpa.services.CommandeService;
import fr.mathias.magasinjpa.services.ProduitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {


    @Bean
    public ClientService clientService(ClientRepository repository, ObjectMapper mapper) {
        return new ClientService(repository, mapper);
    }

    @Bean
    public ProduitService produitService(ProduitRepository repository) {

        return new ProduitService(repository);
    }

    @Bean
    public CommandeService commandeService(CommandeRepository repository) {

        return new CommandeService(repository);
    }










}
