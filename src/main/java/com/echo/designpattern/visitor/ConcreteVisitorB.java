package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class ConcreteVisitorB implements Visitor {

	@Override
	public void visitA(ConcreteNodeA concreteNodeA) {
		// do nothing
	}

	@Override
	public void visitB(ConcreteNodeB concreteNodeB) {
		concreteNodeB.operationB();
	}

}
