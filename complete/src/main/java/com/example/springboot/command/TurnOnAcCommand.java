package com.example.springboot.command;

public class TurnOnAcCommand implements ICommand {

    private final AC ac;

    public TurnOnAcCommand(AC ac) {
        this.ac = ac;
    }

    /**
     *
     */
    @Override
    public void execute() {
        ac.turnOn();
    }

    /**
     *
     */
    @Override
    public void undo() {
        ac.turnOff();
    }
}
