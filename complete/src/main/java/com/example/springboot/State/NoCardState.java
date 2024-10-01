package com.example.springboot.State;

public class NoCardState implements ATMState {

    private final ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card insert operation invoked");
        atmMachine.setAtmState(atmMachine.getHasCardState());
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
     */
    @Override
    public void requestCash(int cash) {
        throw new RuntimeException("Cannot do this operation now");
    }
}
