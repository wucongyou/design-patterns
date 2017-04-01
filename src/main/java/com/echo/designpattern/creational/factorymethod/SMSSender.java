package com.echo.designpattern.creational.factorymethod;

public class SMSSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("sms " + message);
    }

}
