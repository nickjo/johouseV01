package com.johousev01.springboot.controller.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    @GetMapping("/")
    public String mvMainPage(){
        return "index";
    }

    @GetMapping("/contact")
    public String mvContact(){
        return "contact";
    }
}
