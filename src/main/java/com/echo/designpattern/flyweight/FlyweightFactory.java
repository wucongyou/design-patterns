package com.echo.designpattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	private int visitCount;

	public Flyweight getFlyweight(String objStr) {
		Flyweight flyweight = flyweights.get(objStr);
		visitCount++;
		if (flyweight == null) {
			flyweight = new Concretelyweight(objStr);
			flyweights.put(objStr, flyweight);
		}
		return flyweight;
	}

	public int getFlyweightsSize() {
		return flyweights.size();
	}

	public int getVisitcount() {
		return visitCount;
	}
}
