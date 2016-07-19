package com.echo.designpattern.memento;

/**
 * Originator in this pattern
 */
public class Originator {
	private String name;
	private int value;

	public Originator(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Memento getMemento() {
		return new Memento(value);
	}

	public void recovery(Memento memento) {
		value = memento.getValue();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Originator [name=" + name + ", value=" + value + "]";
	}

}
