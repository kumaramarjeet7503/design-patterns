package com.app.strategy;

public class CryptoStrategy implements PaymentStrategy {

    @Override
    public String authenticatePayment() {
        
        try {
            System.out.println("Your request is authenticated via crypto");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Authenticated" ;

    }

    @Override
    public String validatePayment() {
        try {
            System.out.println("Your request is validated via crypto");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Validated" ;
    }

    @Override
    public String processPayment() {
        try {
            System.out.println("Your request is processed via crypto");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Processed" ;
    }
    
}
