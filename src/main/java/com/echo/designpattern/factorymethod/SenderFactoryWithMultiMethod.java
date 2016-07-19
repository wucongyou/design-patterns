package com.echo.designpattern.factorymethod;

/**
 * 工厂，为每一个具体产品写一个生产方法
 */
public class SenderFactoryWithMultiMethod {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
