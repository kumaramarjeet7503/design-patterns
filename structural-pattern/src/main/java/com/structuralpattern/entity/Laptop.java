package com.structuralpattern.entity;

import com.structuralpattern.decorator.Device;

public class Laptop extends Device {

    @Override
    public Double cost() {
        System.out.println("The total cost of laptop : 50000");
        return 50000.00 ;
    }
    
}
