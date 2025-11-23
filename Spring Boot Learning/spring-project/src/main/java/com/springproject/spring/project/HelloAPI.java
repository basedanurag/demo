package com.springproject.spring.project;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAPI {
    @GetMapping("/hello/{name}")
    public HelloConsumer sayHelloparam(@PathVariable String name){
        return new HelloConsumer("Hello "+ name);
    }
    @GetMapping("/hello")
    public HelloConsumer sayHello(){
        return new HelloConsumer("Hello World");
    }
    @PostMapping("/hello")
    public HelloConsumer postHello(@RequestBody String name ){
        return new HelloConsumer("Hello "+ name+" !");
    }
}
