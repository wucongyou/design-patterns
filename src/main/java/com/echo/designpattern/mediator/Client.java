package com.echo.designpattern.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator("Greeting Mediator");
		Colleague c1 = new ConcreteColleague("Tom");
		Colleague c2 = new ConcreteColleague("Mary");
		Colleague c3 = new ConcreteColleague("Mike");
		mediator.add(c1);
		mediator.add(c2);
		mediator.add(c3);
		
		Action action = new Action("Hi,there!", "Hi");
		c1.act(action);
		
		System.out.println();
		c2.act(action);
		
		System.out.println();
		c3.act(action);
	}

}
