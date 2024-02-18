package com.app.prototype;

import lombok.Getter;

@Getter
public class SpreadsheetDocument implements DocumentPrototype  {

    private String prop = "abcd" ;

    @Override
    public DocumentPrototype cloneDoc() {
        System.out.println("Cloning Spredsheet document");
        SpreadsheetDocument doc = new SpreadsheetDocument() ;
        doc.prop = this.prop ;
        return doc ;
    }

    @Override
    public void customize() {
       System.out.println("You are customizing the spreadsheet document");
    }
    
}
