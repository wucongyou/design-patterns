package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class ConcreteNodeA implements Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitA(this);
	}

	public void operationA() {
		System.out.println("Concrete Node A.");
	}

}
