package com.mbadr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    private final Random random = new Random();

    @GetMapping( path = "hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("""
                { 
                "yourLuckyNumberIs": "%d"
                }
                """.formatted(random.nextInt(11)));
    }
}
