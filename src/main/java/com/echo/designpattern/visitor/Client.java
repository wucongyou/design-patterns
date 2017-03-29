package com.echo.designpattern.visitor;

public class Client {

    public static void main(String[] args) {
        NodeCollection nodeCollection = new NodeCollection();
        nodeCollection.doAccept(new VisitorA());
        nodeCollection.doAccept(new VisitorB());
    }

}
