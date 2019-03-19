package com.flash.dataU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class ApplicationDB {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDB.class,args);
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
