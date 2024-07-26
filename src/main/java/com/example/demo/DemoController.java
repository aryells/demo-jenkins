package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping
    public String getApplicationName() {
        return applicationName;
    }

}
