package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetContoller {
    @GetMapping("/greeting")
    public String greeting(){
        return "Hello World";
    }
}
