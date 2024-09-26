package com.example.springboot.COR;

public abstract class AbstractPaymentHandler implements IPaymentHandler {

    private IPaymentHandler nextHandler;

    @Override
    public void setNext(IPaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void callNext(PaymentRequest request) {
        if (nextHandler != null) {
            nextHandler.processPayment(request);
        }
    }

    // Subclasses will implement their specific logic here
    @Override
    public abstract void processPayment(PaymentRequest request);
}

