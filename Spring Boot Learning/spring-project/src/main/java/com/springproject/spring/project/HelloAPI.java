package com.springproject.spring.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloAPI {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
    @PostMapping("/hello")
    public String postHello(@RequestBody String name ){
        return "Hello "+ name+" !";
    }
}
