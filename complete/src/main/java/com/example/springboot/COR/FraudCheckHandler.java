package com.example.springboot.COR;

public class FraudCheckHandler extends AbstractPaymentHandler {

    private IPaymentHandler nextHandler;

    @Override
    public void setNext(IPaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        if (request.isFraudulent()) {
            System.out.println("Fraud check failed.");
            return;
        }
        System.out.println("Fraud check passed.");
        callNext(request);
    }
}
