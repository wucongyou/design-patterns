package com.echo.designpattern.decorator;

public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("Decorator : before running decoratee's method");
		source.method();
		System.out.println("Decorator : after running decoratee's method");
	}
}
