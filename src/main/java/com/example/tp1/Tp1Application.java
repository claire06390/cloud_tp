package com.example.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.tp1"}) // add this so the spring boot context knows where to look for entities
public class Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

}
