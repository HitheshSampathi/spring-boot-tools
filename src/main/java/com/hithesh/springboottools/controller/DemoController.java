package com.hithesh.springboottools.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getDemoResponse")
    public String getDemoResponse() {
        return " This is an demo response for validating restart";
    }
}

