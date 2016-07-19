package com.echo.designpattern.bridge;

public class RefinedAbstratcion extends Abstraction {

	public RefinedAbstratcion(Implementor implementor) {
		super(implementor);
	}

	@Override
	public RefinedImplementor getImplementor() {
		return (RefinedImplementor) super.getImplementor();
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
