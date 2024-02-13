package com.structuralpattern.entity;

import com.structuralpattern.decorator.Device;

public class Mobile extends Device {

    @Override
    public Double cost() {
        System.out.println("The cost of base mobile : 20000.00 ");
        return 20000.00 ;
    }
    
}
