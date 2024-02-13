package com.structuralpattern.decorator;

 public class ExtendedWarranty extends Device {

    private Device device ;

    public ExtendedWarranty(Device device)
    {
        this.device = device ;
    }

    @Override
    public Double cost() {
        System.out.println("Adding Extended waranty cost : 500");
            Double price = this.device.cost() + 500.00 ;
        return price;
    }
    
}
