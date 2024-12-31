package com.github_actions_demo.github_actions_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        log.info("You've reached the hello world controller!");
        return "Hello World!";

    }
}
