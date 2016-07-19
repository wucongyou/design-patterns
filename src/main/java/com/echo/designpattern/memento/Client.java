package com.echo.designpattern.memento;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator("Tom", 50);
		Caretaker caretaker = new Caretaker(originator.getMemento());
		System.out.println("Before : " + originator);
		originator.setValue(20);
		System.out.println("After : " + originator);
		originator.recovery(caretaker.getMemento());
		System.out.println("Recovery : " + originator);
	}

}
