package com.wucongyou.designpattern.behavioral.interpreter;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:48
 */
public class Context {

    private Map<String, Var> varMap = Maps.newConcurrentMap();

    public Var var(String name) {
        return varMap.get(name);
    }

    public Context allocate(String name, int value) {
        varMap.put(name, new Var(name, value));
        return this;
    }

    public Context assign(String name, int value) {
        if (!varMap.containsKey(name)) {
            throw new IllegalArgumentException("var do not exist");
        }
        varMap.get(name).setValue(value);
        return this;
    }
}
