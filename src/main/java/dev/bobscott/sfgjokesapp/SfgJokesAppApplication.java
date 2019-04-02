package dev.bobscott.sfgjokesapp;

import dev.bobscott.sfgjokesapp.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgJokesAppApplication.class, args);
    }

}
