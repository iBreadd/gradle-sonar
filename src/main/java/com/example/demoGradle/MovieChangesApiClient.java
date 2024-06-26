package com.example.demoGradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieChangesApiClient {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
