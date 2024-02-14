package com.structuralpattern.adapter;

public class LegecyImpl implements LegecyLog {

    @Override
    public String makeLog() {
        System.out.println("Printing old logs...");
        return "true" ;
    }
    
}
