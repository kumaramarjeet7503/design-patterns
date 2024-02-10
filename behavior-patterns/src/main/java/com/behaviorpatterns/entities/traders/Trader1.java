package com.behaviorpatterns.entities.traders;

import com.behaviorpatterns.observerpattern.observable.ObservableInterface;
import com.behaviorpatterns.observerpattern.observer.ObserverInterface;

public class Trader1  implements ObserverInterface {

    private ObservableInterface observable ;
    public Trader1(ObservableInterface observable)
    {
        this.observable = observable ;
    }

    @Override
    public void update() {
       System.out.println(Trader1.class + " stock Price : " + observable.getData() );
    }
    
}
