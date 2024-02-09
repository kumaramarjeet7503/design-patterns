package com.app.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public String authenticatePayment() {
        
        try {
            System.out.println("Your request is authenticated via credit card");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Authenticated" ;

    }

    @Override
    public String validatePayment() {
        try {
            System.out.println("Your request is validated via credit card");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Validated" ;
    }

    @Override
    public String processPayment() {
        try {
            System.out.println("Your request is processed via credit card");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Processed" ;
    }
    
}
