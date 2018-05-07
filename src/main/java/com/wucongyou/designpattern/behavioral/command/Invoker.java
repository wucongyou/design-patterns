package com.wucongyou.designpattern.behavioral.command;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        System.out.print("invoker invoke -> ");
        command.execute();
    }
}
