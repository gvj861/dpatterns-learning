package com.example.springboot.payment;

public class OriginalPaymentProcessor implements PaymentProcessor{

    /**
     *
     */
    @Override
    public void pay() {
        System.out.println("Paid via basic payment Gateway");
    }
}
