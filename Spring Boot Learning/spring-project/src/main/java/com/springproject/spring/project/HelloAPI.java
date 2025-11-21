package com.springproject.spring.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloAPI {
    @GetMapping("/hello")
    public HelloConsumer sayHello(){
        return new HelloConsumer("Hello World");
    }
    @PostMapping("/hello")
    public HelloConsumer postHello(@RequestBody String name ){
        return new HelloConsumer("Hello "+ name+" !");
    }
}
