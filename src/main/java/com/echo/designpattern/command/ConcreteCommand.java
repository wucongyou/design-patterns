package com.echo.designpattern.command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.print("concrete command execute -> ");
        receiver.act();
    }

}