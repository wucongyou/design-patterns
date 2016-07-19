package com.echo.designpattern.abstractfactory;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mail sender!");  	
	}

}
