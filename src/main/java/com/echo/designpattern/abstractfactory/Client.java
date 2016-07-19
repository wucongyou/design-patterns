package com.echo.designpattern.abstractfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new MobilephoneBrandAFactory();
		factory.produceCPU().calculate();
		factory.produceScreen().display();
	}

}
