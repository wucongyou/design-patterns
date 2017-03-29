package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class NodeA implements INode {

    @Override
    public void doAccept(IVisitor visitor) {
        visitor.visit(this);
    }

}
