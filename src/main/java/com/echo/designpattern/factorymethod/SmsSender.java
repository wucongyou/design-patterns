package com.echo.designpattern.factorymethod;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");  	
	}

}
