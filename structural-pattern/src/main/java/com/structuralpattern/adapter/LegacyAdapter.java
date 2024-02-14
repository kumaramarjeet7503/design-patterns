package com.structuralpattern.adapter;

public class LegacyAdapter implements Adapter {

    private LegecyLog legecyLog ; 
    public LegacyAdapter(LegecyLog legacylog)
    {
        this.legecyLog = legacylog ;
    }
    @Override
    public String advanceLog() {
        System.out.println("Printing advance log...");
        return "true" ;
    }

    public String legecyLog()
    {
        System.out.println("Accessing old log...");
        this.legecyLog.makeLog() ;
        return "true" ;
    }
    
}
