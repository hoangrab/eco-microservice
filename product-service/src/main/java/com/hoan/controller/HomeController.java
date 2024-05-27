package com.hoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/")
public class HomeController {
    @Autowired
    private WebClient webClient;


    @GetMapping("test")
    public String test() {
        return "day la product service";
    }

}
