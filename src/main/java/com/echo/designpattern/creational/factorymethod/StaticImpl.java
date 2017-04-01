package com.echo.designpattern.creational.factorymethod;

public class StaticImpl {

    public static Sender mailSender() {
        return new MailSender();
    }

    public static Sender smsSender() {
        return new SMSSender();
    }
}
