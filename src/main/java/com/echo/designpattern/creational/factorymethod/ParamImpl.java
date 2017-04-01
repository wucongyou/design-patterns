package com.echo.designpattern.creational.factorymethod;

public class ParamImpl {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SMSSender();
        } else {
            throw new IllegalArgumentException("unsupported sender type");
        }
    }

}
