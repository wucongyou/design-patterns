package com.echo.designpattern.visitor;

/**
 * Visitor interface
 */
public interface IVisitor {

    void visit(NodeA concreteNodeA);

    void visit(NodeB concreteNodeB);

}
