package mititelu.laura.guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World -- From the primary bean";
    }
}
