package com.echo.designpattern.behavioral.observer;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:38
 */
public class State {

    private String value;

    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "State{" +
            "value='" + value + '\'' +
            '}';
    }
}
