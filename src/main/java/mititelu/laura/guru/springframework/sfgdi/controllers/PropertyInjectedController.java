package mititelu.laura.guru.springframework.sfgdi.controllers;

import mititelu.laura.guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author LMiti3030
 * created on 30.11.2022
 * Exmpl doing manual property injection
 * After adding Controller annotation + autowired on field/property + @Service on greetingServiceImpl -> spring managed
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
