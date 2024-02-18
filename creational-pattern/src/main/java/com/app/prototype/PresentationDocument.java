package com.app.prototype;

import lombok.Getter;

@Getter
public class PresentationDocument implements DocumentPrototype {
    private String prop = "abcd" ;

    @Override
    public DocumentPrototype cloneDoc() {
        System.out.println("Cloning Article document");
        PresentationDocument doc = new PresentationDocument() ;
        doc.prop = this.prop ;
        return doc ;
    }

    @Override
    public void customize() {
       System.out.println("You are customizing the presentation document");
    }
    
}
