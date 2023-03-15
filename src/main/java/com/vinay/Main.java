package com.vinay;

import io.micrometer.observation.transport.Propagator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.HashCodeCustomizer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

//@SpringBootApplication
//@SpringBootApplication is a comprise of together 3 annotations namely @EnableAutoConfiguration,@ComponentScan,@Configuration
@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
@GetMapping("/greet")
    public GreetResponse greet(){
     return new GreetResponse("Hello");
 }
 // record GreetResponse(String greet){}
    class GreetResponse{
        private final String greet;

     GreetResponse(String greet) {
         this.greet = greet;
     }

     public String getGreet() {
         return greet;
     }

     @Override
     public String toString() {
         return "GreetResponse{" +
                 "greet='" + greet + '\'' +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         GreetResponse that = (GreetResponse) o;
         return Objects.equals(greet, that.greet);
     }

     @Override
     public int hashCode() {
         return Objects.hash(greet);
     }
 }
}
