package com.echo.designpattern.composite;

public class Client {

    public static void main(String[] args) {
        // 构造根节点
        Composite rootComponent = new Composite();
        rootComponent.setName("根节点");

        // 添加两个叶子几点，也就是子部件
        Leaf l = new Leaf();
        l.setName("叶子节点1");
        Leaf l1 = new Leaf();
        l1.setName("叶子节点2");

        rootComponent.add(l);
        rootComponent.add(l1);

        // 遍历组合部件
        rootComponent.eachChild();
    }

}
