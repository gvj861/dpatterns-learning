package com.example.springboot.COR;

public class PaymentProcessHandler extends AbstractPaymentHandler {

    @Override
    public void processPayment(PaymentRequest request) {
        System.out.println("Done payment");
        callNext(request);
    }

}
