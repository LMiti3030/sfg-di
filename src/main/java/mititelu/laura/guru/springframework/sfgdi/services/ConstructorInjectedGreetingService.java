package mititelu.laura.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author LMiti3030
 * created on 30.11.2022
 * Added @Service annotation, so it is automattically injected in the controllers -> managed by spring
 */
//@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
