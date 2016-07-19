package com.echo.designpattern.visitor;

/**
 * Concrete visitor
 */
public class ConcreteVisitorA implements Visitor {

	@Override
	public void visitA(ConcreteNodeA concreteNodeA) {
		concreteNodeA.operationA();
	}

	@Override
	public void visitB(ConcreteNodeB concreteNodeB) {
		// do nothing
	}

}
