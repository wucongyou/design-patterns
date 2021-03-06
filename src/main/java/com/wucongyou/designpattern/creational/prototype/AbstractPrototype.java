package com.wucongyou.designpattern.creational.prototype;

public abstract class AbstractPrototype implements Cloneable {

    public AbstractPrototype clone() {
        AbstractPrototype prototype = null;
        try {
            prototype = (AbstractPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}
