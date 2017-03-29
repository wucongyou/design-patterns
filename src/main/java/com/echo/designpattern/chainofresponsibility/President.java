package com.echo.designpattern.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:49
 */
public class President extends AbstractHandler {

    public President() {
        level = Request.Level.HIGH;
    }
}
