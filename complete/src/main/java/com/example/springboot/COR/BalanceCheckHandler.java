package com.example.springboot.COR;

public class BalanceCheckHandler extends AbstractPaymentHandler {

    private IPaymentHandler nextHandler;

    @Override
    public void setNext(IPaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }


    @Override
    public void processPayment(PaymentRequest request) {
        if (request.getAmount() > request.getAccountBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }
        System.out.println("Balance check passed.");
        callNext(request);
    }
}
