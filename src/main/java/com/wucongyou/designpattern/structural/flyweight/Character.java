package com.wucongyou.designpattern.structural.flyweight;

/**
 * @author congyou.wu
 * @since 2017-03-31 上午10:38
 */
public class Character {

    private String value;
    private int size;
    private String color;
    private AbstractFont font;

    public Character(String value, int size, String color, AbstractFont font) {
        this.value = value;
        this.size = size;
        this.color = color;
        this.font = font;
    }

    public void show() {
        System.out.println(value + ", " + size + ", " + color + ", " + font.name() + "@" + Integer.toHexString(font.hashCode()));
    }
}
