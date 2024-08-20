package com.marlisajp.booktok.config;

import com.marlisajp.booktok.models.User;
import com.marlisajp.booktok.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User marlisa = new User("Marlisa", "Pee", "mpee", "mpee@tripadvisor.com", "password");
            User jane = new User("Jane", "Doe", "jane", "jane@tripadvisor.com", "password");
            repository.saveAll(List.of(marlisa,jane));
        };
    }
}
