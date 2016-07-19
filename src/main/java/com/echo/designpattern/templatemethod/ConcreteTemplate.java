package com.echo.designpattern.templatemethod;

public class ConcreteTemplate extends Template {

	@Override
	protected void abstractMethod() {
		System.out.println("The abstract method can only implemented by concrete template.");
	}

}
