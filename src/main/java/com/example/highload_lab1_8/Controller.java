package com.example.highload_lab1_8;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private int count = 0;

    @RequestMapping(value = "/")
    public String index(){
        count++;
        return "Counter = "+count+" ";
    }
}
