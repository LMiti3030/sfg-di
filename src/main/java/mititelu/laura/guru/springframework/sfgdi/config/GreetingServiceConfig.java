package mititelu.laura.guru.springframework.sfgdi.config;

import mititelu.laura.guru.springframework.sfgdi.datasource.FakeDataSource;
import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import mititelu.laura.guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author LMiti3030
 * created on 20.12.2022
 */
@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                  @Value("${guru.password}")String password,
                                  @Value("${guru.jdbcUrl}")String jdbcUrl){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setJdbcUrl(jdbcUrl);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUsername(username);

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
