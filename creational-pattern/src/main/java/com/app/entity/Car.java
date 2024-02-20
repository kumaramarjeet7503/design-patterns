package com.app.entity;

public class Car {
    private String model ;
    private String engine ;
    private String color ;
    private boolean hasBluetooth ;
    private boolean hasSunroof ;
    private boolean hasGPS ;

    public Car(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + ", color=" + color + ", hasBluetooth=" + hasBluetooth
                + ", hasSunroof=" + hasSunroof + ", hasGPS=" + hasGPS + "]";
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
  
}
