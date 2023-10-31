package com.practice.myrestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello Bro";
    }

    @GetMapping(path="/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Beanssssss");
    }

    @GetMapping(path = "/hello-path/{name}")
    public String getHelloNameFromPath(@PathVariable String name){
        return "Hello " + name;
    }
}
