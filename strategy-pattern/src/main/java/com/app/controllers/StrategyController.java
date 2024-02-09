package com.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Payment;
import com.app.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class StrategyController {
    /**
        * Problem: You are developing a payment processing system for an e-commerce platform. The platform supports multiple payment methods such as credit card, PayPal, and cryptocurrency. Each payment method has its own unique validation, authentication, and processing logic.
        * Using the Strategy design pattern, you can create a family of algorithms (strategies) for processing payments. Each payment method (credit card, PayPal, cryptocurrency) can be encapsulated into its own strategy class, allowing the payment processing system to dynamically select and use the appropriate payment strategy at runtime based on the user's choice
        * The Strategy pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. This allows the client code (e-commerce platform) to use different payment methods without knowing the specific implementation details of each method, promoting flexibility and maintainability.
     */

    @Autowired
     private PaymentService PaymentService ;

    @GetMapping("/checkout/{paymentMethod}")
    public ResponseEntity<String> checkout(@PathVariable String paymentMethod) {
        //  Make payment through payment class
        PaymentService.paymentInit(paymentMethod) ;
        return ResponseEntity.ok("done");
    }
    
}
