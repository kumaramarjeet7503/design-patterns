package com.structuralpattern.decorator;

public class UpgradeStorage extends Device {

    private Device device ;

    public UpgradeStorage(Device device)
    {
        this.device = device ;
    }

    @Override
    public Double cost() {
        System.out.println("Adding Upgrade storage cost : 300");
        Double price = this.device.cost() + 300.00 ;
        return price;
    }
    
}
