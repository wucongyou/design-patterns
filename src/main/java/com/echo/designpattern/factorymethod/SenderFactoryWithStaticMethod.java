package com.echo.designpattern.factorymethod;

/**
 * 静态工厂
 */
public class SenderFactoryWithStaticMethod {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
