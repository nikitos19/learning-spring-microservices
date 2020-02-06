package com.licensing.service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @Value("${tracer.property}")
    private String tracerProperty;

    @GetMapping
    public String sayHello() {
        return "Hi! I'm " + tracerProperty;
    }
}
