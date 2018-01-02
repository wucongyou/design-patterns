package com.echo.designpattern.behavioral.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:51
 */
public class CyclicIter<T> implements Iter<T> {

    private int position;
    private Collect<T> collect;

    public CyclicIter(Collect<T> collect) {
        position = -1;
        this.collect = collect;
    }

    @Override
    public T next() {
        if (position < collect.size() - 1) {
            return collect.get(++position);
        }
        // reset to start position when reach end
        position = -1;
        return null;
    }

    @Override
    public boolean hasNext() {
        return position < collect.size() - 1;
    }
}
