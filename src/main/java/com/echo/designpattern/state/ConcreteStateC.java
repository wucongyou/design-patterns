package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class ConcreteStateC implements State {

	@Override
	public void operation(Context context) {
		System.out.println("Now it's concrete state C.");
		context.setState(new ConcreteStateA());
	}

}
