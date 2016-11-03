package com.echo.designpattern.visitor;

/**
 * Node interface
 */
public interface INode {

  void doAccept(IVisitor visitor);

}
