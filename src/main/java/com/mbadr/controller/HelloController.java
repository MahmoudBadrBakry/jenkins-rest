package com.mbadr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @GetMapping( "hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("""
                { 
                "yourLuckyNumberIs": "%d"
                }
                """.formatted(new Random(11).nextInt()));
    }
}
