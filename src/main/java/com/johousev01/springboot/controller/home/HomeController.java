package com.johousev01.springboot.controller.home;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/index.html")
    public String mvIndex(){
        return "index";
    }

    @GetMapping("/index-2.html")
    public String mvIndex2(){ return "index-2"; }

    @GetMapping("/index-3.html")
    public String mvIndex3(){ return "index-3"; }

    @GetMapping("/index-4.html")
    public String mvIndex4(){ return "index-4"; }
}
