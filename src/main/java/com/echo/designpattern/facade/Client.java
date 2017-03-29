package com.echo.designpattern.facade;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.execute();
        computer.shutdown();
    }

}
