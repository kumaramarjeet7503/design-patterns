package com.app.builder;

import com.app.entity.Car;

public class ConcreteCarBuilder implements CarBuilder {

    private Car car ;

    public ConcreteCarBuilder()
    {
        this.car = new Car("Default","Default","Default") ;
    }

    @Override
    public CarBuilder setEngine(String engine) {
       this.car.setEngine(engine);
       return this ;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.car.setModel(model);
        return this ;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.car.setColor(color);
       return this ;
    }

    @Override
    public CarBuilder addGPS(Boolean gps) {
        this.car.setHasGPS(gps);
        return this ;
    }

    @Override
    public CarBuilder addBluetooth(Boolean bluetooth) {
        this.car.setHasBluetooth(bluetooth);;
       return this ;
    }

    @Override
    public CarBuilder addSunroof(Boolean sunroof) {
        this.car.setHasSunroof(sunroof);;
        return this ;
    }

    @Override
    public Car build() {
        return this.car ;
    }
    
}
