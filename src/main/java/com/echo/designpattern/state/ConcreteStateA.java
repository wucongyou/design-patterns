package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class ConcreteStateA implements State {
	
	@Override
	public void operation(Context context) {
		System.out.println("Now it's concrete state A.");
		context.setState(new ConcreteStateB());
	}

}
