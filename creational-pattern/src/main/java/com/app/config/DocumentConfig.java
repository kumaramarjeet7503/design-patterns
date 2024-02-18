package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.prototype.DocumentManager;

@Configuration
public class DocumentConfig {

    @Bean
    DocumentManager getDocumentManager()
    {
        System.out.println("You are in a bean and a document manager is creating");
        return DocumentManager.getInstance() ;
    }

}
