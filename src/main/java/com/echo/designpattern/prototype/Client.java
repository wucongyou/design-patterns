package com.echo.designpattern.prototype;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		ConcretePrototype x = null;
		x=(ConcretePrototype) cp.clone();
		x.showInfo();
	}
}
