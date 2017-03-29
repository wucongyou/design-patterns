package com.echo.designpattern.factorymethod;

/**
 * 工厂，为每一个具体产品写一个生产方法
 */
public class SenderFactoryWithMultiMethod {

    public ISender produceMailSender() {
        return new MailSender();
    }

    public ISender produceSMSSender() {
        return new SMSSender();
    }

}
