package com.echo.designpattern.visitor;

public class Client {

	public static void main(String[] args) {
		ObjectStructure objs = new ObjectStructure(new ConcreteNodeA(), new ConcreteNodeB(), new ConcreteNodeA(),
				new ConcreteNodeA());
		System.out.println("Visit Node A : ");
		Visitor visitor = new ConcreteVisitorA();
		objs.accept(visitor);
		System.out.println("\nVisit Node B : ");
		visitor = new ConcreteVisitorB();
		objs.accept(visitor);
	}

}
