package com.echo.designpattern.visitor;

/**
 * Visitor interface
 */
public interface Visitor {

	public void visitA(ConcreteNodeA concreteNodeA);

	public void visitB(ConcreteNodeB concreteNodeB);
}
