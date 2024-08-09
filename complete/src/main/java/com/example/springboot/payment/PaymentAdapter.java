package com.example.springboot.payment;

public class PaymentAdapter implements PaymentProcessor {

    private RazorPay rp;

    public PaymentAdapter (RazorPay rp) {
        this.rp = rp;
    }

    /**
     *
     */
    @Override
    public void pay() {
        rp.makePayment();
    }
}
