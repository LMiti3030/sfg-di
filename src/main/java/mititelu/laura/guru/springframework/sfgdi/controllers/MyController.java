package mititelu.laura.guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hi everyone";
    }
}
