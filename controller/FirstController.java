package com.vegetables.shortv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
        @RequestMapping("/hello")
        public String helloWorld(){
            return "hello world";
        }

}
