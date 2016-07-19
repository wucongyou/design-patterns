package com.echo.designpattern.mediator;

public class ConcreteColleague extends AbstractColleague {
	
	private String name;

	public ConcreteColleague(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
