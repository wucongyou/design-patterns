package com.echo.designpattern.abstractfactory;

public class SmsSenderFactory implements Provider {
	
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
