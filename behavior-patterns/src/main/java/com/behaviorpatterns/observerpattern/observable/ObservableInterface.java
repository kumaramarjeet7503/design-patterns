package com.behaviorpatterns.observerpattern.observable;

import com.behaviorpatterns.observerpattern.observer.ObserverInterface;

public interface ObservableInterface {
    
   public abstract void addObserver(ObserverInterface observer) ;
   public abstract void removeObserver(ObserverInterface observer) ;
   public abstract void notifyObservers() ;
   public abstract void setData(Double stockPrice) ;
   public abstract Double getData() ;
}
