package org.example.xo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

        @GetMapping
    public String getUser(){
            return "Hello world1";
    }
}
