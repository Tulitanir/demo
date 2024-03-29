package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World");
    }
}
