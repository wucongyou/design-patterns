package com.echo.designpattern.adapter;

public class Client {

    public static void main(String[] args) {
        IAdapter adapter = new Adapter(new Adaptee());
        adapter.method1();
        adapter.method2Adapted();
    }

}
