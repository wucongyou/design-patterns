package com.wucongyou.designpattern.behavioral.state;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:44
 */
public enum State {
    SLEEP("sleep at night", null),
    STUDY("study at daytime", SLEEP),
    EAT("eat", STUDY),
    WAKE_UP("wake up at morning", EAT),;

    private String desc;
    private State next;

    State(String desc, State next) {
        this.desc = desc;
        this.next = next;
    }

    public State next() {
        return next;
    }

    @Override
    public String toString() {
        return this.name() + "(" + desc + ")";
    }
}
