package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.Animal;
import ru.itsjava.Piglet;

@Configuration
public class MyConfig {

    @Bean
    public Animal piglet(){
        return new Piglet();
    }


}
