package mititelu.laura.guru.springframework.sfgdi.controllers;

import mititelu.laura.guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author LMiti3030
 * created on 30.11.2022
 * Manual constructor injection
 * After adding Controller annotation + autowired on constructor + @Service on greetingServiceImpl -> spring managed
 * autowired on constructor is optional!!
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
