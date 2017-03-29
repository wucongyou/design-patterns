package com.echo.designpattern.factorymethod;

/**
 * 静态工厂
 */
public class SenderFactoryWithStaticMethod {

    public static ISender produceMail() {
        return new MailSender();
    }

    public static ISender produceSms() {
        return new SMSSender();
    }

}
