package com.echo.designpattern.bridge;

public class ConcreteAImplementor extends Implementor {

	@Override
	public void operation() {
		System.out.println("This is concrete A implementor's operation acting.");
	}
	
	public void anotherOperationPart1(){
		System.out.println("This is another operation part 1.");
	}
	public void anotherOperationPart2(){
		System.out.println("This is another operation part 2.");
	}
}
