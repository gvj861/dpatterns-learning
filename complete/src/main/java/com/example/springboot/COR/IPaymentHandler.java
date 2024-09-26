package com.example.springboot.COR;

public interface IPaymentHandler {

    void setNext(IPaymentHandler handler);

    void processPayment(PaymentRequest request);

}
