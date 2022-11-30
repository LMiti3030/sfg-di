package mititelu.laura.guru.springframework.sfgdi;

import mititelu.laura.guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import mititelu.laura.guru.springframework.sfgdi.controllers.MyController;
import mititelu.laura.guru.springframework.sfgdi.controllers.PropertyInjectedController;
import mititelu.laura.guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        //SpringApplication.run(SfgDiApplication.class, args); -> actually returns the context

        MyController myController = (MyController) context.getBean("myController");
        //by default the spring bean has the name of the class but with lower first letter
        //you need to do a cast
        //when app starts, Spring will look for things that were annotated as beans and creat those into the context
        //the instance of the controller was created by spring for the context at startup
        //using getBean you get the reference to the instance created
        //Spring framework manages the creations of all beans

        String greeting = myController.sayHello();
        //utilization of the object

        System.out.println(greeting);

        System.out.println("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter Based");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor Based");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }

}
