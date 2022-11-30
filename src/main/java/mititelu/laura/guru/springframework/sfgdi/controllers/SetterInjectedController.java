package mititelu.laura.guru.springframework.sfgdi.controllers;

import mititelu.laura.guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author LMiti3030
 * created on 30.11.2022
 * Manual setter injection
 * After adding Controller annotation + autowired on setter + @Service on greetingServiceImpl -> spring managed
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
