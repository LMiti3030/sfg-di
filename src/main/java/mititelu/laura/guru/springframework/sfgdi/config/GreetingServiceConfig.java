package mititelu.laura.guru.springframework.sfgdi.config;

import mititelu.laura.guru.springframework.sfgdi.datasource.FakeDataSource;
import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import mititelu.laura.guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

/**
 * @author LMiti3030
 * created on 20.12.2022
 */
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConfiguration sfgConfiguration){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setJdbcUrl(sfgConfiguration.getJdbcUrl());
        fakeDataSource.setPassword(sfgConfiguration.getPassword());
        fakeDataSource.setUsername(sfgConfiguration.getUsername());

        return fakeDataSource;
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

//    @Bean
//    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
//        return new ConstructorInjectedGreetingService();
//    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository  englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }





}
