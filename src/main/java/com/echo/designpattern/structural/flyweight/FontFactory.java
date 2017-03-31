package com.echo.designpattern.structural.flyweight;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * Flyweight factory.
 *
 * @author congyou.wu
 * @since 2017-03-31 上午10:57
 */
public class FontFactory {

    private Map<Rendered, Class> rendered = ImmutableMap.<Rendered, Class>builder()
        .put(Rendered.HELVETICA, Helvetica.class)
        .put(Rendered.ARIAL, Arial.class)
        .build();
    /**
     * NOTE We do not use ConcurrentHashMap here
     * because we do not need update this map currently and more importantly,
     * because the ConcurrentHashMap is weak-consistent.
     */
    private Map<Rendered, AbstractFont> map = Maps.newHashMap();

    public AbstractFont get(Rendered req) {
        if (map.containsKey(req)) {
            return map.get(req);
        }
        // NOTE Need sync because HashMap may cause dead loop under concurrency.
        synchronized (this) {
            if (!map.containsKey(req)) {
                rendered.forEach((r, clazz) -> {
                    if (r == req) {
                        try {
                            map.put(r, (AbstractFont) clazz.newInstance());
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
        return map.get(req);
    }

    public enum Rendered {
        HELVETICA,
        ARIAL,;
    }
}
