package com.wucongyou.designpattern.behavioral.command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.print("concrete command run -> ");
        receiver.act();
    }

}
