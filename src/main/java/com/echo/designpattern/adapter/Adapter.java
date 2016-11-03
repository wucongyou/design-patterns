package com.echo.designpattern.adapter;

public class Adapter implements Targetable {
	private Adaptee adaptee = new Adaptee();

	public void Wrap(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void method1() {
		System.out.println("This is the origin Adapter doSomething");
	}

	@Override
	public void method2Adapted() {
		adaptee.method2();
	}

}
