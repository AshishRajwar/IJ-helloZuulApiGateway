package com.example.helloZuulApiGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zuulgateway")
public class ZuulApiGatewayController {

    @GetMapping("/zuul")
    public String getHello()  {
        return "zuul";
    }

}
