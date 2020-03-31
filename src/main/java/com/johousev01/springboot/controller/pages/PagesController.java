package com.johousev01.springboot.controller.pages;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class PagesController {

    @GetMapping("/about.html")
    public String mvAbout(){
        return "about";
    }

    @GetMapping("/about-2.html")
    public String mvAbout2(){
        return "about-2";
    }

    @GetMapping("/faq.html")
    public String mvFaq(){
        return "faq";
    }

    @GetMapping("/contact.html")
    public String mvContact(){
        return "contact";
    }

    @GetMapping("/privacy.html")
    public String mvPrivacy(){
        return "privacy";
    }
}
