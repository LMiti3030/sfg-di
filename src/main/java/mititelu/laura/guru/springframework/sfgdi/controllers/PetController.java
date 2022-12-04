package mititelu.laura.guru.springframework.sfgdi.controllers;

import mititelu.laura.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
