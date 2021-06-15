package fr.mathias.magasinjpa.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.mathias.magasinjpa.repositories.ClientRepository;
import fr.mathias.magasinjpa.services.ClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    public ClientService clientService(ClientRepository repository, ObjectMapper mapper) {
        return new ClientService(repository, mapper);
    }
}
