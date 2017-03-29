package com.echo.designpattern.iterator;

import java.util.List;

/**
 * ICollection 接口 仅声明与迭代器模式相关的方法
 */
public interface ICollection {

    IIterator iterator();

    List<Object> getItems();

    Object get(int index);

    int size();

}
