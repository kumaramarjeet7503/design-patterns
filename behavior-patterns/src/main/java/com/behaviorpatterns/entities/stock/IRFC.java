package com.behaviorpatterns.entities.stock;

import java.util.ArrayList;
import java.util.List;

import com.behaviorpatterns.entities.traders.Trader1;
import com.behaviorpatterns.entities.traders.Trader2;
import com.behaviorpatterns.observerpattern.observable.ObservableInterface;
import com.behaviorpatterns.observerpattern.observer.ObserverInterface;

public class IRFC implements ObservableInterface {

    private List<ObserverInterface> observers = new ArrayList<>()  ;
    private Double stockPrice ;

    public IRFC()
    {


    }

    @Override
    public void addObserver(ObserverInterface observer) {
        System.out.println("observer");
        System.out.println(observer);
       this.observers.add(observer) ;

    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        this.observers.remove(observer) ;
    }

    @Override
    public void notifyObservers() {
       for (ObserverInterface observer : this.observers) {
            observer.update();
       }
    }

    @Override
    public void setData(Double stockPrice) {
        
        if(this.stockPrice == stockPrice)
        {
            this.stockPrice = stockPrice ;
            this.notifyObservers();
        } 

    }

    @Override
    public Double getData() {
       return this.stockPrice ;
    }
     
}
