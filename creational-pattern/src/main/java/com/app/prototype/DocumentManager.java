package com.app.prototype;

import java.util.HashMap;
import java.util.Map;


public class DocumentManager {
    private Map<String,DocumentPrototype> prototype = new HashMap<>() ;

    private static DocumentManager documentManager ;
    
    private DocumentManager()
    {

    }

    public DocumentPrototype getClonedDocument(String type)
    {
        DocumentPrototype docPrototype  = prototype.get(type)  ;
        docPrototype.cloneDoc() ;
        return  docPrototype ;
    }

    public void registerDocumentPrototype(String type, DocumentPrototype document)
    {
        System.out.println("Registering new prototype of :"+type);
        prototype.put(type,document) ;
    }

    public static DocumentManager getInstance()
    {
        if(documentManager == null)
            {
                documentManager = new DocumentManager() ;
                documentManager.prototype.put("Article", new ArticleDocument() );
                documentManager.prototype.put("SpreadSheet", new SpreadsheetDocument() );
            }
        return documentManager ;
    }
}
