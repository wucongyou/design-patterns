package com.echo.designpattern.factorymethod;
/**
 * 相当于具体产品
 */
public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mail sender!");  	
	}

}
