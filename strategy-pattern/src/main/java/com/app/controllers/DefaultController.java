package com.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class DefaultController {
    
    @GetMapping("/hotel/{hotelName}")
    public ResponseEntity<String> getMethodName(@PathVariable String hotelName) {

        Logger logger = Logger.getLogger("mylogs");
        FileHandler fh ;

        try {
            fh = new FileHandler("/var/www/laravel/bikmo/app/log.log") ;
            logger.addHandler(fh);
            SimpleFormatter simpleFormatter = new SimpleFormatter() ;
            fh.setFormatter(simpleFormatter);
            logger.info("this is my firs logger");
            logger.info("Rahija");
        } catch (Exception e) {
           System.out.println(e.getMessage()); ;
        }
        

        return ResponseEntity.ok("hotelName");
    }
    
}
