package com.echo.designpattern.bridge;

public class RefinedImplementor extends Implementor {

	@Override
	public void operation() {
		System.out.println("This is refined implementor acting.");
	}

	public void anotherOperationPart1() {
		System.out.println("This is another operation part 1.");
	}

	public void anotherOperationPart2() {
		System.out.println("This is another operation part 2.");
	}
}
