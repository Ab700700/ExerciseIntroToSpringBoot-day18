package com.example.exerciseintrotosrpingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExerciseIntroToSrpingBootApplication  {

    public static void main(String[] args) {

        SpringApplication.run(ExerciseIntroToSrpingBootApplication.class, args);
    }


    @GetMapping("/name")
    public String name() {
        return "My name is windows";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is 25";
    }

    @GetMapping("/check/status")
    public String check() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] names() {
        return new String[]{"Ali", "Ahamd", "Abulrahman"};
    }






}



