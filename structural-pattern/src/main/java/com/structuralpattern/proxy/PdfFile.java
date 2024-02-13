package com.structuralpattern.proxy;

public class PdfFile implements FileSystem {

    @Override
    public String retrieve() {
        System.out.println("you are getting the file ... hang tight");
        return "ok" ;
    }

    @Override
    public String modify() {
        System.out.println("you are modifying the file ...");
        return "ok" ;
    }
    
}
