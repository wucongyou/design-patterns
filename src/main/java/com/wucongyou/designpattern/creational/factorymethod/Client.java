package com.wucongyou.designpattern.creational.factorymethod;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午10:34
 */
public class Client {

    public static void main(String[] args) {
        new SimpleSenderFactory().produce("mail").send("hi, there");
        new SimpleSenderFactory().produce("sms").send("hi, there");
        new MultiMethodImpl().maiSender().send("hi, there");
        new MultiMethodImpl().smsSender().send("hi, there");
        StaticImpl.mailSender().send("hi, there");
        StaticImpl.smsSender().send("hi, there");
    }
}
