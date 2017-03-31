package com.echo.designpattern.behavioral.visitor;

/**
 * Concrete node
 */
public class NodeA implements INode {

    @Override
    public void doAccept(IVisitor visitor) {
        visitor.visit(this);
    }

}
