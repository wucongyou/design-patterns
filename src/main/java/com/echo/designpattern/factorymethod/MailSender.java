package com.echo.designpattern.factorymethod;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mail sender!");  	
	}

}
