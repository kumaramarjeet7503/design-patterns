package com.app.strategy;

public interface PaymentStrategy {
    
    //  Interface created for payment strategy
    public abstract String authenticatePayment() ;
    public abstract String validatePayment() ;
    public abstract String processPayment() ;
}
