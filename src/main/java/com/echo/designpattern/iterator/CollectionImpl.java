package com.echo.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class CollectionImpl implements ICollection {

    List<Object> items;

    public CollectionImpl() {
        items = new ArrayList<>();
    }

    public CollectionImpl(List<Object> items) {
        List<Object> list = new ArrayList<>();
        list.addAll(items);
        this.items = list;
    }

    @Override
    public IIterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public List<Object> getItems() {
        List<Object> list = new ArrayList<>();
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
