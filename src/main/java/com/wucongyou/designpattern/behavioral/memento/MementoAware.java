package com.wucongyou.designpattern.behavioral.memento;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午10:56
 */
public interface MementoAware {

    Memento memento();

    void recovery(Memento memento);
}
