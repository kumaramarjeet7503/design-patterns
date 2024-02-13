package com.structuralpattern.proxy;



public class FileProxy implements FileSystem {

    FileSystem file ; 

    public FileProxy(FileSystem file)
    {
        this.file = file ;
    }

    @Override
    public String retrieve() {
        this.writeAccessLog()  ;
        String result = "You are not allowed for this action." ; 
        if(isAutheticated())
        {
            result = file.retrieve() ;
        }
        return result;
    }

    @Override
    public String modify() {
        this.writeAccessLog()  ;
        String result = "You are not allowed for this action." ; 
        if(isAutheticated())
        {
            result = file.modify() ;
        }
        return result;
    }

    private Boolean isAutheticated()
    {
        System.out.println("you are being authenticating");
        return true ;
    }

    private String writeAccessLog()
    {
        System.out.println("Access log is writing for the file");
        return "write access log" ;
    }
    
}
