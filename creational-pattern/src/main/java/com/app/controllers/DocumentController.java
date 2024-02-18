package com.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.prototype.ArticleDocument;
import com.app.prototype.DocumentManager;
import com.app.prototype.PresentationDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/document")
public class DocumentController {

    /*
    Imagine you are developing a document management system where users can create and collaborate on various types of documents.
    Each document can have different structures, such as articles, presentations, or spreadsheets.
    Your goal is to implement a prototype design pattern to allow users to clone existing documents and customize them as needed. 
    */

    @Autowired
    private DocumentManager documentManager ;

    @GetMapping("/prototype")
    public String getPrototype() {

        this.documentManager.registerDocumentPrototype("Presentation",new PresentationDocument());

        ArticleDocument articleDocument = (ArticleDocument)  this.documentManager.getClonedDocument("Article") ;
        System.out.println(articleDocument.getProp());
        articleDocument.customize();
        

        return new String();
    }
    
}
