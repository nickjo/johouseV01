package com.johousev01.springboot.controller.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BlogController {

    @GetMapping("/blog.html")
    public String mvBlog(){
        return "blog";
    }

    @GetMapping("/blog-masonry.html")
    public String mvBlogMasonry(){
        return "blog-masonry";
    }

    @GetMapping("/post.html")
    public String mvPost(){
        return "post";
    }

}
