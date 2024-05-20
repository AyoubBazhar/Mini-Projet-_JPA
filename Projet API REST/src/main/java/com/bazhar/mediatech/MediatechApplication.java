package com.bazhar.mediatech;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MediatechApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediatechApplication.class, args);
    }
@Bean  //had  obejct  c'est  un bean  o ghay gerih spring  o  we can ID it
    ModelMapper getmodelemapper (){
        return  new ModelMapper();
}
}
