package com.echo.designpattern.bridge;

public class ConcreteAAbstraction extends Abstraction {

	public ConcreteAAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public ConcreteAImplementor getImplementor() {
		return (ConcreteAImplementor) super.getImplementor();
	}

	@Override
	public void operation() {
		getImplementor().operation();
	}

	public void anotherOperation() {
		System.out.println("This is another operation acting.");
		getImplementor().anotherOperationPart1();
		getImplementor().anotherOperationPart2();
	}

}
