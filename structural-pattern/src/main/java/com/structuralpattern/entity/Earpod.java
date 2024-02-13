package com.structuralpattern.entity;

import com.structuralpattern.decorator.Device;

public class Earpod extends Device {

    @Override
    public Double cost() {
        System.out.println("The cost of base mobile : 6000.00 ");
        return 6000.00 ;
    }
    
}
