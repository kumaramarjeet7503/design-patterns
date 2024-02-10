package com.app.service;

import org.springframework.stereotype.Service;

import com.app.entity.Payment;
import com.app.factory.PaymentMethodFactory;
import com.app.strategy.PaymentStrategy;

@Service
public class PaymentService {

    
    public String paymentInit(String methodName)
    {
        PaymentMethodFactory paymentFactory = new PaymentMethodFactory() ;
        PaymentStrategy paymentStrategy = paymentFactory.getPaymentMethod(methodName) ;
        Payment payment = new Payment(paymentStrategy) ;
        payment.makePayment() ;
        return "succes" ;
    }
}