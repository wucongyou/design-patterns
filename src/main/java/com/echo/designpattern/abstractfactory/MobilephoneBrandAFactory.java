package com.echo.designpattern.abstractfactory;

public class MobilephoneBrandAFactory implements AbstractFactory {

	@Override
	public CPU produceCPU() {
		return new QualcommCPU();
	}

	@Override
	public Screen produceScreen() {
		return new JDIScreen();
	}

}
