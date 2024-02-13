package com.structuralpattern.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structuralpattern.proxy.FileProxy;
import com.structuralpattern.proxy.FileSystem;
import com.structuralpattern.proxy.PdfFile;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/proxy")
public class FileSystemController {
    
    /**
     * You are working on a secure file access system for a confidential document repository.
        Implement the Proxy design pattern to control and monitor access to sensitive files.
        The proxy should provide functionalities such as access logging, authentication, and authorization checks before allowing clients to retrieve or modify files.
        Describe how you would design the classes and interactions to ensure secure and controlled access to the files through the proxy.
        Provide an example illustrating the implementation and benefits of using the Proxy pattern in this context.
     */

    @GetMapping("/file")
    public String fileOperation() { 

        PdfFile file = new PdfFile() ;
        FileSystem fileSystem = new FileProxy(file) ;
        fileSystem.retrieve() ;
        fileSystem.modify() ;
        return "helllo";
    }
    
}
