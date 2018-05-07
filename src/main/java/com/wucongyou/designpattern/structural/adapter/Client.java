package com.wucongyou.designpattern.structural.adapter;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:17
 */
public class Client {

    public static void main(String[] args) {
        new ChangeoverPlug(new TwoParseOutlet()).threeParseCharge();
    }
}
