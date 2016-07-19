package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class ConcreteNodeB implements Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitB(this);
	}

	public void operationB() {
		System.out.println("Concrete Node B.");
	}
}
