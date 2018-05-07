package com.wucongyou.designpattern.creational.factorymethod;

public class MailSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("mail " + message);
    }

}
