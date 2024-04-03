package com.example.lab11_final;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IntegerController {

    @GetMapping("/double")
    public int doubleNumber(@RequestParam int number) {
        return number * 2;
    }
    }
