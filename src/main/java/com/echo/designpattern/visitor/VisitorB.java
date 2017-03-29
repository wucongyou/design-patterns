package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class VisitorB implements IVisitor {

    private String name = "B";

    @Override
    public void visit(NodeA concreteNodeA) {
        System.out.println("Visitor " + name + " visits nodeA");
    }

    @Override
    public void visit(NodeB concreteNodeB) {
        System.out.println("Visitor " + name + " visits nodeA");
    }

}
