package com.example.springboot.State;

public class HasCardState implements ATMState {

    private final ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
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
        System.out.println("Card ejected.");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    /**
     * @param pin
     */
    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN.");
            atmMachine.setState(atmMachine.getHasPinState());
        } else {
            System.out.println("Incorrect PIN. Try again.");
        }
    }

    /**
     * @param cash
     */
    @Override
    public void requestCash(int cash) {
        throw new RuntimeException("Cannot do this operation now");
    }
}
