package com.first.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class CrudApplication {

    @GetMapping("/")
    public String helloWorld(){
        return "teste";
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }
}
