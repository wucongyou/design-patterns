package com.echo.designpattern.composite;

public abstract class Component {
	protected String name;

	protected abstract void add(Component component);

	protected abstract void remove(Component component);

	protected abstract void eachChild();
	
	protected abstract void eachChild(int n);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
