package mititelu.laura.pets;

/**
 * @author LMiti3030
 * created on 20.12.2022
 */

public class PetServiceFactory {

    public PetService getPetService(String petType){
        return switch(petType){
            case "dog" -> new DogPetService();
            case "cat" -> new CatPetService();
            default -> new DogPetService();
        };
    }
}
