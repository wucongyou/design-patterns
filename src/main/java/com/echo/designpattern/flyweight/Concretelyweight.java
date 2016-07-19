package com.echo.designpattern.flyweight;

public class Concretelyweight extends Flyweight {

	public Concretelyweight(String name) {
		super.name = name;
	}

	@Override
	public void operation() {
		System.out.println("Concrete flyweight : " + name+" @"+this);
	}

}
