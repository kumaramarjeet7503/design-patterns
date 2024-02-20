package com.app.builder ;

import com.app.entity.Car;

public class CarDirector {

     private CarBuilder carBuilder ;
     public CarDirector(CarBuilder carBuilder)
     {
        this.carBuilder = carBuilder ;
     }

     public Car construct()
     {
        return this.carBuilder
        .setModel("F-43")
        .setEngine("V8")
        .setModel("Hyper")
        .addBluetooth(true).build() ;
     }
}