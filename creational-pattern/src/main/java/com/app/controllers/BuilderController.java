package com.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.builder.CarDirector;
import com.app.builder.ConcreteCarBuilder;
import com.app.entity.Car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/builder")
public class BuilderController {
    

    /*
     * You are working on a software application for a car manufacturing company.
     * The company produces different types of cars with various configurations and optional features.
     * Each car has a set of mandatory parameters such as the model, engine type, and color, as well as optional features like GPS, Bluetooth, and sunroof.
     * The goal is to create a flexible and extensible system for constructing cars with different configurations.
    */

    @GetMapping("/build")
    public String build() {

        ConcreteCarBuilder concreteCarBuilder = new ConcreteCarBuilder() ;
        CarDirector carDirector = new CarDirector(concreteCarBuilder) ;
        Car car =  carDirector.construct() ;
        System.out.println(car);
        return new String(car.toString());
    }
    
}
