package com.echo.designpattern.templatemethod;

public class ConcreteTemplateB extends Template {

	@Override
	protected void abstractMethod() {
		System.out.println("The abstract method can only implemented by concrete template.");
	}

	@Override
	protected void hookMethod() {
		System.out.println("Now the hook method is overrided by concrete template.");
	}

}
