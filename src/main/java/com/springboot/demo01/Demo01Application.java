package com.springboot.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo01Application {

    @RequestMapping("/")
    public String show(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

}
