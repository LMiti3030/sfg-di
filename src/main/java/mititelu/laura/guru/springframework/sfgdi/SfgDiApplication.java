package mititelu.laura.guru.springframework.sfgdi;

import mititelu.laura.guru.springframework.sfgdi.controllers.*;
import mititelu.laura.guru.springframework.sfgdi.datasource.FakeDataSource;
import mititelu.laura.guru.springframework.sfgdi.services.PrototypeBean;
import mititelu.laura.guru.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"mititelu.laura.guru.springframework.sfgdi", "mititelu.laura.pets"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = context.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) context.getBean("myController");

        System.out.println("----- Primary bean");
        System.out.println(myController.sayHello());

        System.out.println("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter Based");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor Based");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

//        System.out.println("----Using Pet Bean Factory");
//        PetServiceFactory petServiceFactory = (PetServiceFactory) context.getBean("petServiceFactory");
//        System.out.println("dog: " + petServiceFactory.getPetService("dog"));
//        System.out.println("cat: " + petServiceFactory.getPetService("cat"));
//        System.out.println("default: " + petServiceFactory.getPetService("nothing"));

        System.out.println("------ Bean Scopes -------");
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcUrl());
    }

}
