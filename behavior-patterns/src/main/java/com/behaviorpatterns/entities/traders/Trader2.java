package com.behaviorpatterns.entities.traders;

import com.behaviorpatterns.observerpattern.observable.ObservableInterface;
import com.behaviorpatterns.observerpattern.observer.ObserverInterface;

public class Trader2 implements ObserverInterface {

    private ObservableInterface observable ;
    public Trader2(ObservableInterface observable)
    {
        this.observable = observable ;
    }

    @Override
    public void update() {
       System.out.print(Trader2.class + " stock Price : " + observable.getData() );
    }
    
}
