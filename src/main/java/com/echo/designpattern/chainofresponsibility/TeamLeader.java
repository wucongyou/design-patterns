package com.echo.designpattern.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:23
 */
public class TeamLeader extends AbstractHandler {

    public TeamLeader() {
        level = Request.Level.LOW;
    }
}
