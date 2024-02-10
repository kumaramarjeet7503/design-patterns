package com.behaviorpatterns.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.behaviorpatterns.entities.stock.IRFC;
import com.behaviorpatterns.entities.traders.Trader1;
import com.behaviorpatterns.entities.traders.Trader2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/stock")
public class StockController {
    /* 
    You are working on a stock trading application.
    The application needs to notify users when the price of a specific stock crosses a certain threshold.
    Implement the stock trading application using the Observer design pattern to ensure that users are notified when the stock price crosses the specified threshold.
    */

    @GetMapping("/notify")
    public String notifyObserver() {

        IRFC irfc = new IRFC() ;
        Trader1 trader1 = new Trader1(irfc) ;
        Trader2 trader2 = new Trader2(irfc) ;

        irfc.addObserver(trader1);
        irfc.addObserver(trader2);
        irfc.setData(10.24);

        return new String();
    }
    

}
