package com.wucongyou.designpattern.creational.factorymethod;

public class MultiMethodImpl {

    public Sender maiSender() {
        return new MailSender();
    }

    public Sender smsSender() {
        return new SMSSender();
    }
}
