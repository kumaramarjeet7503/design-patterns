package com.structuralpattern.composite;

public class Employee implements Organisation {

    private String name ;

    public Employee(String name)
    {
        this.name = name ;
    }

    @Override
    public String getDesign() {
        System.out.println("Employee name : "+this.name);
        return "true" ;
    }
    
}
