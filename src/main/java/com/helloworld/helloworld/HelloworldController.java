package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloworldController {

    @GetMapping("/hello")
    public String hello() {
        return ("Good Morning");
    }
}
