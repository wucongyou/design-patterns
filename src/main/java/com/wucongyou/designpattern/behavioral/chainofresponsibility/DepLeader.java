package com.wucongyou.designpattern.behavioral.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:48
 */
public class DepLeader extends AbstractHandler {

    public DepLeader() {
        level = Request.Level.MIDDLE;
    }
}
