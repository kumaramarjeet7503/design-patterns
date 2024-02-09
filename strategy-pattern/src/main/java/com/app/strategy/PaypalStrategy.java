package com.app.strategy;

public class PaypalStrategy implements PaymentStrategy {

    @Override
    public String authenticatePayment() {
        
        try {
            System.out.println("Your request is authenticated via paypal");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Authenticated" ;

    }

    @Override
    public String validatePayment() {
        try {
            System.out.println("Your request is validated via paypal");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Validated" ;
    }

    @Override
    public String processPayment() {
        try {
            System.out.println("Your request is processed via paypal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Processed" ;
    }
    
}
