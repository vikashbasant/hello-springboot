package com.kash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloSpringBootApplication {
    public static void main(String[] args) {

        // This is how spring boot application runs on the background via this run method:
    	SpringApplication.run(HelloSpringBootApplication.class, args);
    }


}
