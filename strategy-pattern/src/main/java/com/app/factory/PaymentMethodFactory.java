package com.app.factory;

import com.app.strategy.CreditCardStrategy;
import com.app.strategy.CryptoStrategy;
import com.app.strategy.PaymentStrategy;
import com.app.strategy.PaypalStrategy;

import lombok.Getter;
import lombok.Setter;


public class PaymentMethodFactory {
    
    private CreditCardStrategy creditCardStrategy ;
    private PaypalStrategy paypalStrategy ;
    private CryptoStrategy cryptoStrategy ;

    public PaymentStrategy getPaymentMethod(String methodName)
    {
        PaymentStrategy paymentStrategy  = null;

        switch (methodName) {
            case "pay-pal":
                    paymentStrategy = new PaypalStrategy() ;
                break;
            case "credit-card":
                    paymentStrategy = new CreditCardStrategy() ;
                break ;
            case "crypto":
                    paymentStrategy = new CryptoStrategy() ;
                break ;
            default:
                break;
        }

        return paymentStrategy ;
    }

}
