package com.echo.designpattern.factorymethod;

/**
 * 工厂，只有一个生产方法，通过传入的字符串参数决定创建哪一个产品
 */
public class SenderFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

}
