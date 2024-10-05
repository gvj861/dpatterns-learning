package com.example.springboot.command;

public class TurnOffAcCommand implements ICommand {
    private final AC ac;

    public TurnOffAcCommand(AC ac) {
        this.ac = ac;
    }

    /**
     *
     */
    @Override
    public void execute() {
        ac.turnOff();
    }

    /**
     *
     */
    @Override
    public void undo() {
        ac.turnOn();
    }
}
