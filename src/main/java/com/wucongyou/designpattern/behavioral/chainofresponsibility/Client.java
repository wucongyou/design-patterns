package com.wucongyou.designpattern.behavioral.chainofresponsibility;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午10:24
 */
public class Client {

    public static void main(String[] args) {
        AbstractHandler c = new TeamLeader();
        c.setSuccessor(new DepLeader()).setSuccessor(new President());
        Response resp = c.handle(new Request(Request.Level.HIGH, "take a long leave"));
        System.out.println(resp);
    }
}
