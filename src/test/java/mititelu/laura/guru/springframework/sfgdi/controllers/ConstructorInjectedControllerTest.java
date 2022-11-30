package mititelu.laura.guru.springframework.sfgdi.controllers;

import mititelu.laura.guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author LMiti3030
 * created on 30.11.2022
 * Manual constructor injection
 */
class ConstructorInjectedControllerTest {


    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller  = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}