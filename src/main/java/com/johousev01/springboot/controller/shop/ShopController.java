package com.johousev01.springboot.controller.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ShopController {

    @GetMapping("/category-full.html")
    public String mvCategoryFull(){
        return "category-full";
    }

    @GetMapping("/category-full-sidebar.html")
    public String mvCategoryFullSidebar(){
        return "category-full-sidebar";
    }

    @GetMapping("/category-big-products.html")
    public String mvCategoryBigProducts(){
        return "category-big-products";
    }

    @GetMapping("/category-boxed.html")
    public String mvCategoryBoxed(){
        return "category-boxed";
    }

    @GetMapping("/category-sidebar.html")
    public String mvCategorySidebar(){
        return "category-sidebar";
    }

    @GetMapping("/category-masonry.html")
    public String mvCategoryMasonry(){
        return "category-masonry";
    }

    @GetMapping("/category-categories.html")
    public String mvCategoryCategories(){
        return "category-categories";
    }

    @GetMapping("/detail-1.html")
    public String mvDetail1(){
        return "detail-1";
    }

    @GetMapping("/detail-2.html")
    public String mvDetail2(){
        return "detail-2";
    }

    @GetMapping("/detail-3.html")
    public String mvDetail3(){
        return "detail-3";
    }
}
