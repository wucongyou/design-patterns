package com.echo.designpattern.iterator;

public class ConcreteIterator implements Iterator {
	private int idx;// 存储当前已经迭代过的最后一个元素的位置
	private Collection collection;

	public ConcreteIterator(Collection collection) {
		idx = -1;
		this.collection = collection;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (idx < collection.size() - 1) {
			++idx;
			obj = collection.get(idx);
		} else {
			idx = -1;
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = false;
		if (idx < collection.size() - 1)
			hasNext = true;
		return hasNext;
	}
}
