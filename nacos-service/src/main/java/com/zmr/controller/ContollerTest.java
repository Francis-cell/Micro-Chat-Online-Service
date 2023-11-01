package com.zmr.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class ContollerTest {
    @GetMapping("/test01")
    public String addOrder(){
        System.out.println("OK");
        return "123";
    }
}
