package com.example.springboot.State;

public class OutOfOrderState implements ATMState {

    private final ATMMachine atmMachine;

    public OutOfOrderState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    /**
     *
     */
    @Override
    public void insertCard() {
        throw new RuntimeException("Cannot do this operation now");
    }

    /**
     *
     */
    @Override
    public void ejectCard() {
        throw new RuntimeException("Cannot do this operation now");
    }

    /**
     * @param pin
     */
    @Override
    public void enterPin(int pin) {
        throw new RuntimeException("Cannot do this operation now");
    }

    /**
     * @param cash
     */
    @Override
    public void requestCash(int cash) {
        throw new RuntimeException("Cannot do this operation now");
    }
}
