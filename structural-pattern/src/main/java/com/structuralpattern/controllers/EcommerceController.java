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

    @GetMapping("/aux")
    public Double calculateCost() {
        
        Laptop laptop = new Laptop() ;
        Device device = new PremiumAccessories( new ExtendedWarranty( new PremiumAccessories(laptop) ));
        return device.cost() ;
    }
    
}