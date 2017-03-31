package com.echo.designpattern.behavioral.visitor;

/**
 * Visitor interface
 */
public interface IVisitor {

    void visit(NodeA concreteNodeA);

    void visit(NodeB concreteNodeB);

}
