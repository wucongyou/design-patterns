package com.echo.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        IBuilder builder = new Builder();// 具体建造者
        Director director = new Director(builder);// 指挥者
        director.construct();// 建造
        Computer computer = builder.retrieveResult();// 获取产品
        System.out.println(computer);
    }

}
