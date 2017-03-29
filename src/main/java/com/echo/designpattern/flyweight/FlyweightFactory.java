package com.echo.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;

public class FlyweightFactory implements IFlyweightFactory {

    private Map<String, AbstractFlyweight> flyweights = new HashMap<String, AbstractFlyweight>();
    private Map<String, Integer> visitCounts = Maps.newHashMap();

    @Override
    public AbstractFlyweight getInstance(String key) {
        if (!flyweights.containsKey(key)) {
            visitCounts.put(key, 0);
            flyweights.put(key, new Flyweight(key));
        }
        visitCounts.put(key, visitCounts.get(key) + 1);
        return flyweights.get(key);
    }

    @Override
    public int size() {
        return flyweights.size();
    }

    @Override
    public int visitCount(String key) {
        if (!visitCounts.containsKey(key)) {
            return 0;
        }
        return visitCounts.get(key);
    }

}
