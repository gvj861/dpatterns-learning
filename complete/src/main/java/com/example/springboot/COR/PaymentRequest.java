package com.example.springboot.COR;

public class PaymentRequest {
    private double amount;
    private double accountBalance;
    private boolean fraudulent;

    // Constructors, Getters, Setters
    public PaymentRequest(double amount, double accountBalance, boolean fraudulent) {
        this.amount = amount;
        this.accountBalance = accountBalance;
        this.fraudulent = fraudulent;
    }

    public double getAmount() {
        return amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean isFraudulent() {
        return fraudulent;
    }
}