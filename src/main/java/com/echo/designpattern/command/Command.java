package com.echo.designpattern.command;

public class Command implements ICommand {
    private Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command calls Receiver's doAction.");
        receiver.action();
    }

}
