package com.echo.designpattern.behavioral.visitor;

/**
 * Node interface
 */
public interface INode {

    void doAccept(IVisitor visitor);

}
