package mititelu.laura.guru.springframework.sfgdi.services;

import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import mititelu.laura.guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;

/**
 * @author LMiti3030
 * created on 30.11.2022
 */
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
