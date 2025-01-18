package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }
}

@RestController
class ProfileController {
    @GetMapping("/profile")
    public String profile() {
        return "Welcome to the Demo App!\nName: John Doe\nRole: DevOps Engineer";
    }
}