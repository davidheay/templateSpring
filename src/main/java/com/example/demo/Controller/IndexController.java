package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("")
public class IndexController {

    @GetMapping()
    public String get() {
        return "index";
    }

}
