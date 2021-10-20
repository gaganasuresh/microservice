package com.spring.appdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
    @RequestMapping("/myfirst")
    public String sayhello() {

        return "welcome everybody";
    }
    @RequestMapping("/mysecond")
    public String greetings() {

        return "How are you guys doing?";
    }
    @RequestMapping("/mythird")
    public String goodwishes() {

        return "Hope you guys are doing good?";
    }
}
