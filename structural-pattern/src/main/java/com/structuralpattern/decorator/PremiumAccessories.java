package com.structuralpattern.decorator;

 public class PremiumAccessories extends Device {


    private Device device ;

    public PremiumAccessories(Device device)
    {
        this.device = device ;
    }

    @Override
    public Double cost() {
        System.out.println("Adding Premium Accessories cost : 1000");
        Double price = this.device.cost() + 1000.00 ;
        return price;
    }
    
}
