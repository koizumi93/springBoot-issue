package com.HelloWorld.demoHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoHelloWorldController {
    @GetMapping("/localTime")
    public String localTime(){
        return "現在時刻" + LocalDateTime.now();
    }
}
