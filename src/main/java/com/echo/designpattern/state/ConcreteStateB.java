package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class ConcreteStateB implements State {

	@Override
	public void operation(Context context) {
		System.out.println("Now it's concrete state B.");
		context.setState(new ConcreteStateC());
	}

}
