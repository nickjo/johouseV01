package com.johousev01.springboot.controller.docs;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class DocsController {

    @GetMapping("docs/index.html")
    public String mvDocsIndex(){
        return "docs/index";
    }
}
