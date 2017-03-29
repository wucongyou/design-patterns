package com.echo.designpattern.factorymethod;

/**
 * 相当于具体产品
 */
public class MailSender implements ISender {

    @Override
    public void send(String message) {
        System.out.println("Sent mail: " + message);
    }

}
