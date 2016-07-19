package com.echo.designpattern.bridge;

public class Client {

	public static void main(String[] args) {
		ConcreteAAbstraction concreteAAbstraction = new ConcreteAAbstraction(new ConcreteAImplementor());
		concreteAAbstraction.operation();
		concreteAAbstraction.anotherOperation();

		RefinedAbstratcion refinedAbstratcion = new RefinedAbstratcion(new RefinedImplementor());
		refinedAbstratcion.operation();
		refinedAbstratcion.anotherOperation();
	}

}
