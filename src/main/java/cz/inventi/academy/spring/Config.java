package cz.inventi.academy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

    @Bean
    public CountService countService() {
        // TODO: Define service
        return new CountServiceImpl();
        //return null;
    }
}