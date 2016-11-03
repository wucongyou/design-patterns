package com.echo.designpattern.abstractfactory;

public class SamsungScreen implements IScreen {
	@Override
	public void doDisplay() {
		System.out.println("JDI screen is displaying.");
	}
}
