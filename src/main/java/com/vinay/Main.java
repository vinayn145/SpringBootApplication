package com.vinay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@SpringBootApplication is a comprise of together 3 annotations namely @EnableAutoConfiguration,@ComponentScan,@Configuration
@ComponentScan(basePackages = "com.vinay")
@EnableAutoConfiguration
@Configuration
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
@GetMapping("/greet")
    public String greet(){
     return "Hello";
 }
}
