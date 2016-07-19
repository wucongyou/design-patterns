package com.echo.designpattern.flyweight;

public class Client {

	public static void main(String[] args) {
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight f1 = flyweightFactory.getFlyweight("Google");
		f1.operation();
		Flyweight f2 = flyweightFactory.getFlyweight("MS");
		f2.operation();
		Flyweight f3 = flyweightFactory.getFlyweight("Google");
		f3.operation();
		System.out.println("Flyweights total size : " + flyweightFactory.getFlyweightsSize());
		System.out.println("Total visit " + flyweightFactory.getVisitcount() + " times.");
	}

}
