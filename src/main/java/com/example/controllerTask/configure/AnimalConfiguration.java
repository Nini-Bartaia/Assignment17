package com.example.controllerTask.configure;


import com.example.controllerTask.service.AnimalService;
import com.example.controllerTask.service.catService;
import com.example.controllerTask.service.dogService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalConfiguration {



    @Bean
    @Qualifier("dogService")
    public AnimalService getDogService(){

        return new dogService();
    }

    @Bean
    @Qualifier("catService")
    public AnimalService getCatService(){

        return new catService();
    }


}
