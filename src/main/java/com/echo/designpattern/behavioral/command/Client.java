package com.echo.designpattern.behavioral.command;

public class Client {

    public static void main(String[] args) {
        new Invoker(new ConcreteCommand(new Receiver())).invoke();
    }
}
