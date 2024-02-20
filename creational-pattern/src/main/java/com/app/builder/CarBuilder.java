package com.app.builder;

import com.app.entity.Car;

public interface CarBuilder {
    public abstract CarBuilder setEngine(String engine)  ;
    public abstract CarBuilder setModel(String model)  ;
    public abstract CarBuilder setColor(String color)  ;
    public abstract CarBuilder addGPS(Boolean gps)  ;
    public abstract CarBuilder addBluetooth(Boolean bluetooth)  ;
    public abstract CarBuilder addSunroof(Boolean sunroof)  ;
    public abstract Car build() ;

}
