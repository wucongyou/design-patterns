package com.echo.designpattern.iterator;

import java.util.List;

/**
 * Collection 接口 仅声明与迭代器模式相关的方法
 */
public interface Collection {
	public Iterator iterator();

	public List<Object> getItems();

	public Object get(int index);

	public int size();

}
