package mititelu.laura.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
//@Profile("cat")
//@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
