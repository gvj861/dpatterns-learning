package com.example.springboot.State;

public class HasPINState implements ATMState {
    private final ATMMachine atmMachine;

    public HasPINState(ATMMachine atmMachine) {
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
        throw new RuntimeException("Cannot do this operation now");
    }

    /**
     * @param cash
     */
    @Override
    public void requestCash(int cash) {
        if (cash <= atmMachine.getCashInMachine()) {
            System.out.println("Dispensing " + cash + " cash.");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cash);

            if (atmMachine.getCashInMachine() == 0) {
                atmMachine.setState(atmMachine.getNoCashState());
            } else {
                atmMachine.setState(atmMachine.getNoCardState());
            }
        } else {
            System.out.println("Not enough cash in machine.");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }
}
