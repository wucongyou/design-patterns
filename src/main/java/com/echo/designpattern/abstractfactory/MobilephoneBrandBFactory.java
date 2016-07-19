package com.echo.designpattern.abstractfactory;

public class MobilephoneBrandBFactory implements AbstractFactory {

	@Override
	public CPU produceCPU() {
		return new MtkCPU();
	}

	@Override
	public Screen produceScreen() {
		return new SamsungScreen();
	}

}
