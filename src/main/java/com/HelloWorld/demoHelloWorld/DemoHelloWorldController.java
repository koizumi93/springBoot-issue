package com.HelloWorld.demoHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHelloWorldController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
