package com.echo.designpattern.templatemethod;

public abstract class Template {

	/**
	 * Template method It contains the top level logic and cannot be modified in
	 * its sub class.
	 */
	public void templateMethod() {
		abstractMethod();
		hookMethod();
		concreteMethod();
	}

	protected abstract void abstractMethod();

	protected void hookMethod() {
		System.out.println("The hook method provide a default implement if the sub class does not override it.");
	}

	private final void concreteMethod() {
		System.out.println("The concrete method has been implemented to realize some business logical.");
	}
}
