package com.example.springboot.State;

public class ATMMachine {
    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    public int cashInMachine = 2000;

    public ATMMachine() {
        hasCard = new HasCardState(this);
        noCard = new NoCardState(this);
        hasCorrectPin = new HasPINState(this);
        atmOutOfMoney = new OutOfOrderState(this);
        atmState = noCard;
    }

    public void setAtmState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered) {
        atmState.enterPin(pinEntered);
    }

    public void setState(ATMState state) {
        this.atmState = state;
    }


    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPinState() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }
}
