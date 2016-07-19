package com.echo.designpattern.decorator;

public class Client {

	public static void main(String[] args) {
		Sourceable source = new Decoratee();
		Sourceable decorator = new Decorator(source);
		decorator.method();
	}

}
