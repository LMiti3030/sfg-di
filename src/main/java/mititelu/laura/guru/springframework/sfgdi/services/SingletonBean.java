package mititelu.laura.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author LMiti3030
 * created on 21.12.2022
 */
@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating a Singleton bean!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
