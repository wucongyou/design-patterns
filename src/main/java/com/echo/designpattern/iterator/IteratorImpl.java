package com.echo.designpattern.iterator;

public class IteratorImpl implements IIterator {

    private int idx;// 存储当前已经迭代过的最后一个元素的位置
    private ICollection collection;

    public IteratorImpl(ICollection collection) {
        idx = -1;
        this.collection = collection;
    }

    @Override
    public Object next() {
        if (idx < collection.size() - 1) {
            ++idx;
            return collection.get(idx);
        } else {
            idx = -1;
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return idx < collection.size() - 1;
    }

}
