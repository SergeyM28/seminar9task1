package ru.mikhailov.microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Microservize-1";
    }

}
