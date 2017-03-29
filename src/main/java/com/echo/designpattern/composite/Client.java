package com.echo.designpattern.composite;

public class Client {

    public static void main(String[] args) {
        new Composite("root").add(new Leaf("leaf")).add(new Leaf("another leaf")).eachChild();
    }
}
