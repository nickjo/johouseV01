package com.johousev01.springboot.controller.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {

    @GetMapping("/cart.html")
    public String mvCart(){
        return "cart";
    }

    @GetMapping("/checkout1.html")
    public String mvCheckout1(){
        return "checkout1";
    }

    @GetMapping("/checkout.html")
    public String mvCheckout(){
        return "checkout";
    }

    @GetMapping("/checkout-confirmed.html")
    public String mvCheckoutConfirmed(){
        return "checkout-confirmed";
    }

    @GetMapping("/wishlist.html")
    public String mvWishlist(){
        return "wishlist";
    }
}
