package com.app.prototype;

import lombok.Getter;

@Getter
public class ArticleDocument implements DocumentPrototype  {

    private String prop = "abcd" ;

    @Override
    public DocumentPrototype cloneDoc() {
        System.out.println("Cloning Article document");
        ArticleDocument doc = new ArticleDocument() ;
        doc.prop = this.prop ;
        return doc ;
    }

    @Override
    public void customize() {
       System.out.println("You are customizing the article document");
    }
    
}
