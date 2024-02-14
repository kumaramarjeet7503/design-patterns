package com.structuralpattern.controllers ;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structuralpattern.decorator.Device;
import com.structuralpattern.decorator.ExtendedWarranty;
import com.structuralpattern.decorator.PremiumAccessories;
import com.structuralpattern.entity.Laptop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

/* 
    Problem Statement 
    You are developing an e-commerce platform where customers can customize their electronic devices.
    Implement the decorator pattern to handle the customization of devices with additional features
    such as upgraded storage, extended warranty, and premium accessories.
    Discuss the class structure and relationships, and provide an example illustrating how
    the decorator pattern allows users to dynamically configure and customize their electronic
    devices during the ordering process.
 */

    @GetMapping("/aux")
    public Double calculateCost() {
        
        Laptop laptop = new Laptop() ;
        Device device = new PremiumAccessories( new ExtendedWarranty( new PremiumAccessories(laptop) ));
        return device.cost() ;
    }
    
}