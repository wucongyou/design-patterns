package com.echo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements Collection {
	List<Object> items = new ArrayList<Object>();

	public ConcreteCollection() {
		items = new ArrayList<Object>();
	}

	public ConcreteCollection(List<Object> items) {
		List<Object> list = new ArrayList<Object>();
		list.addAll(items);
		this.items = list;
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public List<Object> getItems() {
		List<Object> list = new ArrayList<Object>();
		list.addAll(items);
		return list;
	}

	@Override
	public int size() {
		return items.size();
	}

	@Override
	public Object get(int index) {
		return items.get(index);
	}

}
