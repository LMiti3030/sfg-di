package mititelu.laura.guru.springframework.sfgdi.repositories;

/**
 * @author LMiti3030
 * created on 20.12.2022
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
