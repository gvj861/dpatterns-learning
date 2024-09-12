package com.example.springboot.Proxy;

public class RazorPayService implements IPaymentService {
    @Override
    public void pay() {
        System.out.println("RazorPay");
    }
}
