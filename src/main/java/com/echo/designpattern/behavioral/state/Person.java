package com.echo.designpattern.behavioral.state;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:40
 */
public class Person {

    private State state = State.WAKE_UP;

    public Person change() {
        if (state == null) {
            System.out.println("no more state");
            return this;
        }
        System.out.println(state + " -> " + state.next());
        state = state.next();
        return this;
    }
}
