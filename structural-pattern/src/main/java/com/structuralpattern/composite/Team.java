package com.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Organisation {

    private String name ;
    private List<Organisation> orgList = new ArrayList<>() ;

    public Team(Organisation orgItem,String name)
    {
        this.name = name ;
        this.orgList.add(orgItem) ;
    }

    @Override
    public String getDesign() {
        System.out.println("Team name : "+this.name);
        for (Organisation object : orgList) {
            object.getDesign() ;
        }

        return "true" ;
    }
    
}
