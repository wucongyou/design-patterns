package com.echo.designpattern.state;

public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public void operation() {
		state.operation(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
