package com.app.entity;

import com.app.strategy.PaymentStrategy;

public class Payment {

    private PaymentStrategy paymentStrategy ;

    public Payment(PaymentStrategy paymentStrategyObj)
    {
        this.paymentStrategy = paymentStrategyObj ;
    }

    public String makePayment()
    {
        paymentStrategy.authenticatePayment() ;
        paymentStrategy.validatePayment() ;
        paymentStrategy.processPayment() ;
        return "" ;
    }
}
