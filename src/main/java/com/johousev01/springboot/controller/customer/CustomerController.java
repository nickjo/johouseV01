package com.johousev01.springboot.controller.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class CustomerController {

    @GetMapping("/customer-login.html")
    public String mvCustomerLogin(){
        return "customer-login";
    }

    @GetMapping("/customer-orders.html")
    public String mvCustomerOrders(){
        return "customer-orders";
    }

    @GetMapping("/customer-order.html")
    public String mvCustomerOrder(){
        return "customer-order";
    }

    @GetMapping("/customer-order-tracking.html")
    public String mvCustomerOrderTracking(){
        return "customer-order-tracking";
    }

    @GetMapping("/customer-addresses.html")
    public String mvCustomerAddresses(){
        return "customer-addresses";
    }

    @GetMapping("/customer-account.html")
    public String mvCustomerAccount(){
        return "customer-account";
    }

    @GetMapping("/customer-wishlist.html")
    public String mvCustomerWishlist(){
        return "customer-wishlist";
    }
}
