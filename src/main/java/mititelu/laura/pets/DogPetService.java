package mititelu.laura.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
//@Profile({"dog", "default"})
//@Service
public class DogPetService implements PetService{
    public String getPetType(){
        return "Dogs are the best!";
    }
}
