package com.echo.designpattern.mediator;

public class ConcreteMediator extends AbstractMediator {
	
	private String name;
	
	public ConcreteMediator(String name) {
		this.name = name;
	}

	@Override
	public void action(Colleague colleague, Action action) {
		for (Colleague co : colleagues) {
			if (!co.equals(colleague)) {
				co.interactAction(action);
			}
		}
	}

	@Override
	public String toString() {
		return name;
	}

}
