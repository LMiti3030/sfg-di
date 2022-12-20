package mititelu.laura.guru.springframework.sfgdi.config;

import mititelu.laura.pets.CatPetService;
import mititelu.laura.pets.DogPetService;
import mititelu.laura.pets.PetService;
import mititelu.laura.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author LMiti3030
 * created on 20.12.2022
 */
@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return  new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

}
