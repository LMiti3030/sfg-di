package mititelu.laura.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
//@Service
public class SetterInjectedGreetingService implements GreetingService{

    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
