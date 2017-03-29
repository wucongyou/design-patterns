package com.echo.designpattern.command;

public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void runCommand() {
        System.out.println("Invoker calls ICommand's execute.");
        command.execute();
    }
}
